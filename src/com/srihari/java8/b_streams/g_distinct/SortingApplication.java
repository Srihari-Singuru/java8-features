package com.srihari.java8.b_streams.g_distinct;

import java.util.List;

public class SortingApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("d", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        // Display only distinct ticket prices
        list.stream()
                .map(Movie::getPrice)
                .distinct()                     // to get distinct values
                .forEach(System.out::println);
    }
}
