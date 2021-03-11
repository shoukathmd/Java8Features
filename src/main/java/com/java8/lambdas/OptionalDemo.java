package com.java8.lambdas;

import com.java8.lambdas.comparator.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {
    static Map<Integer, Person> map = new HashMap<>();

    public static Optional<Person> getPersonByAge(Integer age) {
        return Optional.ofNullable(map.get(age));
    }
    public static void main(String[] args) {
        Person p1 = new Person("Alex" ,45, "India");
        Person p2 = new Person("Alex2" ,34, "USA");
        Person p3 = new Person("Kalia" , 45, "India");
        Person p4 = new Person("Linux" ,45, "China");

        map.put(123, p1);
        Optional<Person> p = getPersonByAge(12);
        if (p.isPresent()) {
            System.out.println(p.get().getAge());
        } else {
            System.out.println("Empty");
        }
        p.ifPresent(System.out::println);

        System.out.println(p.orElse(new Person("Test" , 2, "India")));
        System.out.println(p.orElseGet(OptionalDemo::getDefault));
    }

    public static Person getDefault(){
        return new Person("", 0, "");
    }
}
