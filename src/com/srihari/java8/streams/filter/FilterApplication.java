package com.srihari.java8.streams.filter;

import java.util.List;
import java.util.function.Predicate;

public class FilterApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        // Print popular movie names
        list.stream()
            .filter(isPopular)    // Filyer takes Predicate
            .forEach(movie -> System.out.println(movie.getName()));
    }
}
