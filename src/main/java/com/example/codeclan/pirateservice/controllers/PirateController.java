package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

// Annotation for controller. Controller handles routes
@RestController
public class PirateController {

//  Singleton creates a single repository instance (instantiates it) for use everywhere on this file
    @Autowired
    PirateRepository pirateRepository;

//  INDEX
    @GetMapping(value="/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

//  Note the use of {} for browser info, the @PathVariable to convert the passed in info to a Long id
//  SHOW (by ID)
    @GetMapping(value="/pirate/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }

//    @GetMapping(value="/pirates/{name}")
//    public List<Pirate> getPiratebyName(@PathVariable String name){
//        return pirateRepository.findOne(name);
//    }

}
