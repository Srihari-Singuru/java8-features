package com.srihari.java8.functional.types.consumer;

import java.util.List;

/**
 * Consumer - takes an argument and doesn't return anything
 * Consumer - void consume(T obj)
 * BiConsumer - void consume(T obj1, E obj2)
 * IntConsumer - void consume(int obj) - removes the cost of autoboxing
 * LongConsumer
 * DoubleConsumer
 */
public class ConsumerApplication {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        // Imperative programming
        for(var item : list) {
            System.out.println(item);
        }

        // Declarative programming
        list.forEach(System.out::println);  // here System.out.println is a consumer
    }
}
