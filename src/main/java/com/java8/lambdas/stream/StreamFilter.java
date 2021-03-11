package com.java8.lambdas.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Biden");
        list.add("Joe");
        list.add("Rock");
        list.add("Alex");

        list.stream().filter(s -> s.contains("Test"))
                .filter(s -> s.contains("5"))
                .forEach(System.out::println);

        List<Integer> list2 = list.stream().filter(s -> s.contains("o"))
                .map(s -> s.length())
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

    }
}
