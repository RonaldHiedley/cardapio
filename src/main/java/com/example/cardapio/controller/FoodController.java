package com.example.cardapio.controller;

import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    public List<Food> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
