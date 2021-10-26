package com.example.demo.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
}
