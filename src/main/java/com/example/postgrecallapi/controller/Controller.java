package com.example.postgrecallapi.controller;

import com.example.postgrecallapi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    FoodService foodService;
    @PostMapping(value = "/insertIntoFoodDetails/{id}/{foodDesc}")
    public ResponseEntity<String> insertIntoFoodDetails(@PathVariable("id") int id,
                                                        @PathVariable("foodDesc") String foodDesc){
        foodService.insertIntoFoodDetails(id, foodDesc);
        return ResponseEntity.ok("Insertion is complete");
    }
}
