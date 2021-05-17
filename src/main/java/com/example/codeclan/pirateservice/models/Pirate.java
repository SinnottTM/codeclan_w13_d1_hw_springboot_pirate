package com.example.codeclan.pirateservice.models;
import javax.persistence.*;

// Entity allows the program to know we need to use with Javax.
@Entity

// This gives the table a name in the DB
@Table(name="pirates")
public class Pirate {

//  This sets the id value for the table created above. Note, getters and setters will be needed for the column to appear in the object itself
    @Id

//  This says the id is linked to identity (increment with new values, are all unique)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//  Creating a column in the table with its column name, length, nullable (allows nulls or not, unique)
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Pirate(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
