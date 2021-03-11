package com.java8.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer.accept("Welcome to Consumer Functional Interface");

        consumer.andThen(consumer1).accept("Hello");
    }
}
