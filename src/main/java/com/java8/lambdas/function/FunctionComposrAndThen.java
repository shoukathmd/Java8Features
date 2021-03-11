package com.java8.lambdas.function;

import java.util.function.Function;

public class FunctionComposrAndThen {

    public static void main(String[] args) {

        Function<Integer, Integer> function1 = s -> s * 2;

        Function<String, Integer> function2 = s -> s.length();

        System.out.println(function1.compose(function2).apply("USA"));

    }
}
