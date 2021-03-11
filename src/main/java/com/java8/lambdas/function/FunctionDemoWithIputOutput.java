package com.java8.lambdas.function;

import java.util.function.Function;

public class FunctionDemoWithIputOutput {


    public static void main(String[] args) {
        Function<String, Integer> function = (s1) -> s1.length();
        Integer value = function.apply("Functional Interfaces");
        System.out.println(value);
    }
}
