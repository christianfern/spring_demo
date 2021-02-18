package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NoDBService {

    final String[] firstNames = {"James", "Matthew", "Jose", "Sue", "Mary", "Emily"};
    final String[] lastNames = {"Smith", "Lopez", "Wang", "Brown", "Jackson", "Connors"};

    public String generateName(){
        Random ran = new Random();
        String firstName = firstNames[ran.nextInt(firstNames.length)];
        String lastName = lastNames[ran.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }




}
