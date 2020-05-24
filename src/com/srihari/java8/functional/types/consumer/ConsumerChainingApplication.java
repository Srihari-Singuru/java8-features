package com.srihari.java8.functional.types.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerChainingApplication {
    public static void main(String[] args) {
        List<String> list = List.of("Srihari", "Siri", "Chinni", "Praneet");

        Consumer<String> print = System.out::println;
        Consumer<String> printLower = item -> System.out.println(item.toLowerCase());
        Consumer<String> printUpper = item -> System.out.println(item.toUpperCase());

        // Chaining of Consumers
        list.forEach(
                print
                .andThen(printLower)
                .andThen(printUpper)
        );
        // The above statement performs all three consumer operations on item by item (not all items at once)

        // Output
        /**
         * Srihari
         * srihari
         * SRIHARI
         * Siri
         * siri
         * SIRI
         * Chinni
         * chinni
         * CHINNI
         * Praneet
         * praneet
         * PRANEET
         */
    }
}
