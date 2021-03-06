package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    //  INDEX
    @GetMapping(value="/ships")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    //  SHOW (by ID)
    @GetMapping(value="/ships/{id}")
    public Optional<Ship> getShip(@PathVariable Long id){
        return shipRepository.findById(id);
    }
}
