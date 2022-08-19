package com.paritosh.learning.simpleadder.controller;

import com.paritosh.learning.simpleadder.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @Autowired
    AdditionService additionService;

    @GetMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b){
        return additionService.add(a,b);
    }
}
