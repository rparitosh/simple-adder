package com.paritosh.learning.simpleadder.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionServiceImpl implements AdditionService{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
