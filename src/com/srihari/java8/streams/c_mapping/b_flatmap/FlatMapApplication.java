package com.srihari.java8.streams.c_mapping.b_flatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapApplication {
    public static void main(String[] args) {
        Stream.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        )
                .forEach(System.out::println);  // will print List<Integer>

        // we can flatten Stream<List<Integer>> to Stream<Integer>
        Stream.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        )
                .flatMap(Collection::stream)    // list -> list.stream()
                .forEach(System.out::println);  // will print individual numbers
    }
}
