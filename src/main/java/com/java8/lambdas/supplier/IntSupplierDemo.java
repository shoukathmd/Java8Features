package com.java8.lambdas.supplier;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierDemo {

    public static void main(String[] args) {
        IntSupplier supplier = () -> (int)(Math.random() * 10);
        System.out.println(supplier.getAsInt());
        System.out.println(supplier.getAsInt());
        System.out.println(supplier.getAsInt());
        System.out.println(supplier.getAsInt());
    }
}
