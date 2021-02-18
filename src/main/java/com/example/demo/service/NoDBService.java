package com.example.demo.service;

import com.example.demo.pojo.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Random;

@RequiredArgsConstructor
@Component
public class NoDBService {

    private final Random ran = new Random();

    private final String[] firstNames = {"James", "Matthew", "Jose", "Sue", "Mary", "Emily"};
    private final String[] lastNames = {"Smith", "Lopez", "Wang", "Brown", "Jackson", "Connors"};

    private String generateFirstName(){
        return firstNames[ran.nextInt(firstNames.length)];
    }

    private String generateLastName(){
        return lastNames[ran.nextInt(lastNames.length)];
    }

    public String generateName(){
        return String.format("%s %s", generateFirstName(), generateLastName());
    }

    public Person generatePerson(){
        return new Person(generateFirstName(), generateLastName(), ran.nextInt(90 - 10) + 10);
    }

}
