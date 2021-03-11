package com.java8.lambdas.predicate;

import com.java8.lambdas.comparator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static boolean isPersonEligibleForVote(Person person, Predicate<Person> predicate) {
        return predicate.negate().test(person);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alex", 18, "USA");

        Predicate<Person> greaterThan = person -> person.getAge() > 20;

        Predicate<Person> lessThan = person -> person.getAge() < 60;

        boolean value = isPersonEligibleForVote(p1, (person -> person.getAge() > 20));
        System.out.println("Person's elgibility : " + value);

        //Predicate and then
        boolean value1 = isPersonEligibleForVote(p1, greaterThan.and(lessThan));
        System.out.println("Person's elgibility and  less than : " + value1);

        //Predicate with or
        Predicate<Person> isFromUSA = person -> "USA".equals(person.getCountry());
        boolean value3 = isPersonEligibleForVote(p1, greaterThan.or(isFromUSA));
        System.out.println("Person's elgibility and  less than or from USA : " + value3);

        //BiPredicate


    }

}
