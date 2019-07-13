package com.example.postgrecallapi.service;

import com.example.postgrecallapi.repository.PostGreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    PostGreRepository postGreRepository;
    public void insertIntoFoodDetails(int id, String foodDesc){
        postGreRepository.insertIntoPostGre(id,foodDesc);
    }
}
