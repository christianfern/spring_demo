package com.example.demo.pojo;

import lombok.*;

@RequiredArgsConstructor
public class Person {
    @Getter @Setter private final String firstName;
    @Getter @Setter private final String lastName;
    @Getter @Setter private final int age;
    @Getter @Setter private final Gender gender;
    @Getter @Setter private String ocupation;
}
