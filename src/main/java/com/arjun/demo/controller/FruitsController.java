package com.arjun.demo.controller;

import com.arjun.demo.entity.Fruit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FruitsController {





    @GetMapping("/fruits")
    public List<Fruit> getAllFruit() {

       return new ArrayList<Fruit>(Arrays.asList(new Fruit(1, "Apple", "Red"), new Fruit(2, "Orange", "Orange")));


    }




}
