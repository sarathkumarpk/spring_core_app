package com.sarath.core_spring.pojo;

import java.util.Random;

public class TestHelper {

    private final int token;

    public TestHelper(){
        Random random = new Random();
        token = random.nextInt();
    }

    public String provideGreeting() {
        return "Hello World" + token;
    }
}
