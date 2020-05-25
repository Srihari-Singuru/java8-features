package com.srihari.java8.streams.f_sorting;

import java.util.Comparator;
import java.util.List;

public class SortingApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        // Sorting by movie name by using Comparator
        list.stream()
                .sorted(Comparator.comparing(Movie::getName))   // (a, b) -> a.getName().compareTo(b.getName())
                .forEach(movie -> System.out.println(movie.getName()));

        // In reverse order
        list.stream()
                .sorted(
                        Comparator
                                .comparing(Movie::getName)
                                .reversed()
                )
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
