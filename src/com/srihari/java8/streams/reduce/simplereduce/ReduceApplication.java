package com.srihari.java8.streams.reduce.simplereduce;

import java.util.Comparator;
import java.util.List;

public class ReduceApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("d", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        list.stream()
                .count();   // Count of elements - long

        list.stream()
                .anyMatch(movie -> movie.getPrice() > 20);  // if any of the elements match the condition - boolean

        list.stream()
                .allMatch(movie -> movie.getPrice() > 20);  // if all of the elements match the condition - boolean

        list.stream()
                .noneMatch(movie -> movie.getPrice() > 20);  // if none of the elements match the condition - boolean

        list.stream()
                .findFirst();  // first element of a Stream - Optional

        list.stream()
                .max(Comparator.comparing(Movie::getPrice)); // Highest prices movie - Optional

        // We also have 'findAny', 'max' (with Comparator), 'min' (with Comparator)
    }
}
