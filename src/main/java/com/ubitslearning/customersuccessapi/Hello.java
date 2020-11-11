package com.ubitslearning.customersuccessapi;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Hello implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "hello class"+ s;
    }
}
