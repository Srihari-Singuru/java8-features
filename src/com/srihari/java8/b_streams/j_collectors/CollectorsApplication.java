package com.srihari.java8.b_streams.j_collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("d", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        // collect all prices into a list
        var prices = list.stream()
                            .filter(movie -> movie.getPrice() > 10)
                            .collect(Collectors.toList());
        System.out.println(prices);

        // collect movie name as key and price as value
        var movieMap = list.stream()
                            .collect(Collectors.toMap(
                                        Movie::getName,
                                        Movie::getPrice
                                    )
                            );
        System.out.println(movieMap);

        // collect movie name as key and Movie object as value
        var movieMap2 = list.stream()
                .collect(Collectors.toMap(
                        Movie::getName,
                        Function.identity()
                        )
                );
        System.out.println(movieMap2);

        // Summing all the prices
        var sum = list.stream()
                        .collect(Collectors.summingInt(Movie::getPrice));
        System.out.println(sum);

        // Summarizing all the prices
        var summary = list.stream()
                            .collect(Collectors.summarizingInt(Movie::getPrice));   // summarizingLong etc..
        System.out.println(summary);

        // joining all the movie names by comma
        var movieJoin = list.stream()
                            .map(Movie::getName)
                            .collect(Collectors.joining(", "));
        System.out.println(movieJoin);
    }
}
