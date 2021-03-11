package com.java8.lambdas.before;

import com.java8.lambdas.Greeting;

import javax.security.sasl.SaslServer;


public class TestGreeting {

    public static void wishGreeting(Greeting greet) {
        greet.wish();
    }

    public static void main(String[] args) {
        //Before java 8
        Greeting hindi = new HindiGreeting();
        hindi.wish();

        Greeting english = new EnglishGreeting();
        english.wish();

        //After java 8
        System.out.println("---> After Java8");
        wishGreeting(() -> System.out.println("English Greeting"));
        wishGreeting(() -> System.out.println("Hindi Greeting"));
        wishGreeting(() -> System.out.println("French Greeting"));
        wishGreeting(() -> System.out.println("Arabic Greeting"));
    }
}
