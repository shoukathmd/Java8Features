package com.java8.lambdas.before;

import com.java8.lambdas.Greeting;

public class EnglishGreeting implements Greeting {
    @Override
    public void wish() {
        System.out.println("English Greeting");
    }
}
