package com.java8.lambdas.comparator;

import java.util.*;

public class PersonService {

    public static void main(String[] args) {
        Person p1 = new Person("Alex", 23, "USA");
        Person p3 = new Person("Shoukath", 36, "India");
        Person p2 = new Person("Shekhar", 25, "China");

        List<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("--------Before java 8----------");
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        });

        System.out.println(list);
        System.out.println("--------After java 8----------");
        Collections.sort(list, (s1, s2) -> s2.getAge() - s1.getAge());
        System.out.println(list);

    }
}
