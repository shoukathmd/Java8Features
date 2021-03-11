package com.java8.lambdas.function.unarybinary;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOfTypeObjectDemo {

    public static void main(String[] arg) {
        UnaryOperator<String> input = s -> s.substring(9);

        System.out.println(input.apply("Mohammed Ali"));

        DoubleUnaryOperator input1 = s -> s/s;

        System.out.println("Double Unary Result : " + input1.applyAsDouble(15));
    }
}
