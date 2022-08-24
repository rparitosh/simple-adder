package com.paritosh.learning.simpleadder.controller;

import com.paritosh.learning.simpleadder.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class AdditionController {

    @Autowired
    AdditionService additionService;

    @GetMapping("/add")
    public String add(@RequestParam int a,@RequestParam int b) throws UnknownHostException {
        String hostname = InetAddress.getLocalHost().getHostName();
        return ("hostname = " + hostname + " Answer =" + additionService.add(a,b));
    }
}
