package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Address {
    @Getter @Setter private String street;
    @Getter @Setter private String city;
    @Getter @Setter private String state;
    @Getter @Setter private String zipCode;
}
