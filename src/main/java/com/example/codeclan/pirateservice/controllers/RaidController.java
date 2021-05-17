package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    //  INDEX
    @GetMapping(value="/raids")
    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }

    //  Note the use of {} for browser info, the @PathVariable to convert the passed in info to a Long id
//  SHOW (by ID)
    @GetMapping(value="/raids/{id}")
    public Optional<Raid> getRaid(@PathVariable Long id){
        return raidRepository.findById(id);
    }
}
