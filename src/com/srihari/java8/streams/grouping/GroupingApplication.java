package com.srihari.java8.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10, Genre.ACTION),
                new Movie("d", 10, Genre.COMEDY),
                new Movie("c", 15, Genre.THRILLER),
                new Movie("a", 20, Genre.ACTION)
        );

        // Default collecting to list (in a map)
        Map<Genre, List<Movie>> result = list.stream()
                                                .collect(
                                                        Collectors.groupingBy(Movie::getGenre)
                                                );
        System.out.println(result);

        // collecting to Set (in a map)
        Map<Genre, Set<Movie>> result2 = list.stream()
                                                .collect(
                                                        Collectors.groupingBy(Movie::getGenre, Collectors.toSet())
                                                );
        System.out.println(result2);

        // map of genre and its count
        Map<Genre, Long> result3 = list.stream()
                                        .collect(
                                                Collectors.groupingBy(Movie::getGenre, Collectors.counting())
                                        );
        System.out.println(result3);

        // map of genre and movie names as a strig joiner
        Map<Genre, String> result4 = list.stream()
                                            .collect(
                                                    Collectors.groupingBy(
                                                            Movie::getGenre,
                                                            Collectors.mapping(    // we can do Collectors.joining if it is String, but since it is a Movie, we need to map first and then join
                                                                    Movie::getName,
                                                                    Collectors.joining(", ")
                                                            )
                                                    )
                                            );
        System.out.println(result4);
    }
}
