package com.java8.lambdas.bipredicate;

import com.java8.lambdas.comparator.Person;

import java.util.function.BiPredicate;

public class BbiPredicateDemo {
    public static boolean isPersongEligible(Person p, Integer age, BiPredicate<Person, Integer> bip) {
        return bip.test(p, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Alex", 34, "India");

        BiPredicate<Person, Integer> biPredicate = (person, age) -> person.getAge() > age;

        boolean value = isPersongEligible(p, 40, biPredicate);
        System.out.println("BiPredicate Test : " + value);
    }
}
