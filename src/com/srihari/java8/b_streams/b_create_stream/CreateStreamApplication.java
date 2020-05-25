package com.srihari.java8.b_streams.b_create_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamApplication {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        collection.stream();    // Every collection has stream() method

        List<String> list = new ArrayList<>();
        list.stream();  // Every collection has stream() method

        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers);

        Stream.of(1, 2, 3);

        Stream.generate(Math::random)  // Infinite stream of random numbers
                                        // In Collection, it may run out of memory
                                        // But in Stream, it is lazy, so one random number at a time
                .limit(3)   // instead of infinite, it will limit to 3 numbers
                .forEach(System.out::println);

        Stream.iterate(1, n -> n++) // Another way of generating infinite numbers
                .limit(10)      // limiting to 10 numbers
                .forEach(System.out::println);
    }
}
