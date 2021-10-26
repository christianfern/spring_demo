package com.example.demo.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Gender gender;
    private final String occupation;
}
