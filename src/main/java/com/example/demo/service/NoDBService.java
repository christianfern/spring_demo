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
        Gender gender = random.nextInt(2) == 0 ? Gender.MALE : Gender.FEMALE;
        Person person = new Person(faker.name().firstName(), faker.name().lastName(), random.nextInt(90 - 18) + 18, gender);
        person.setOcupation(random.nextInt(10) < 7 ? faker.job().title() : null ); //70% chance they have a job
        return person;
    }

}
