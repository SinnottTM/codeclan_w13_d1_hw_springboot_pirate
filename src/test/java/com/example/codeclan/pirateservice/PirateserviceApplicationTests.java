package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// We run these tests using SpringRunner.class, as it has a lot of default settings for DB setting.
@RunWith(SpringRunner.class)
@SpringBootTest
class PirateserviceApplicationTests {

//	Notes that these tests will need to access pirateRepository (for saving to the database)
	@Autowired
	PirateRepository pirateRepository;

//	Checks if app can load to begin with, this will fail if the app is already running
	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(jack);
	}

}
