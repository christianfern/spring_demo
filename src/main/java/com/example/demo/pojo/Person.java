package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Person {
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private int age;
}
