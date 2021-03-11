package com.java8.lambdas.before;

import com.java8.lambdas.Greeting;

public class HindiGreeting implements Greeting {
    @Override
    public void wish() {
        System.out.println("Hindi Greeting");
    }
}
