package com.java8.lambdas.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);

        List<String> list = new LinkedList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");

        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        print("Int stream");
        IntStream intStream = IntStream.of(12,32,45);
        intStream.forEach(System.out::println);
    }
    public static void print(String result) {
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept(result);
    }

}
