package com.java8.lambdas.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, Integer> consumer = (s1, s2) -> System.out.println(s1 + " " + s2);
        consumer.accept("Wecome", 4);
    }
}
