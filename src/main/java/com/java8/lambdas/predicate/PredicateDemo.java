package com.java8.lambdas.predicate;

import com.java8.lambdas.comparator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static boolean isPersonEligibleForVote(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alex", 18, "USA");

        boolean value = isPersonEligibleForVote(p1, (person -> person.getAge() > 20));
        System.out.println("Person's elgibility : " + value);
    }

}
