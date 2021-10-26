package com.example.demo.controller;

import com.example.demo.pojo.Person;
import com.example.demo.service.NoDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/DemoAPI")
public class DemoAPI {

    private final NoDBService noDBService;

    @GetMapping("/generateName")
    public String generateName(){
        return noDBService.generateName();
    }

    @GetMapping("/generatePerson")
    public Person generatePerson(){
        return noDBService.generatePerson();
    }

    @GetMapping("/generatePeople")
    public List<Person> generatePeople(@RequestParam(defaultValue = "3") Integer qty){
        final int LIMIT = 50; //we won't create over this amount
        qty = LIMIT < qty ? LIMIT : qty;
        List<Person> people = new ArrayList<>();
        while(people.size() <= qty){
            people.add(generatePerson());
        }
        return people;
    }

}
