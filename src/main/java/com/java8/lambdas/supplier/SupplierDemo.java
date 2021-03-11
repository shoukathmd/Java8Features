package com.java8.lambdas.supplier;

import com.java8.lambdas.comparator.Person;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static boolean isPersonEligibel(Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }

    public static boolean isPersonEligibel(Supplier<Person> supplier, Integer age, BiPredicate<Person, Integer> predicate) {
        return predicate.test(supplier.get(), age);
    }

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Alex", 45, "China");
        Predicate<Person> predicate = person -> person.getAge() > 60;

        boolean value = isPersonEligibel(supplier, predicate);

        System.out.println("Vote Eligibility : " + value);

        BiPredicate<Person, Integer> biPredicate = ((person, integer) -> person.getAge() > integer);

        boolean value1 = isPersonEligibel(supplier, 30, biPredicate);

        System.out.println( "Eligibility using BiPredicate : " + value1);
    }
}
