package com.example.demo.service;

import com.example.demo.pojo.Gender;
import com.example.demo.pojo.Person;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class NoDBService {

    private final Faker faker;
    private final Random random;

    public String generateName(){
        return faker.name().fullName();
    }

    public Person generatePerson(){
        return new Person(faker.name().firstName(),
                faker.name().lastName(),
                random.nextInt(90 - 18) + 18,
                random.nextInt(2) == 0 ? Gender.MALE : Gender.FEMALE,
                random.nextInt(10) < 7 ? faker.job().title() : null );
    }

}
