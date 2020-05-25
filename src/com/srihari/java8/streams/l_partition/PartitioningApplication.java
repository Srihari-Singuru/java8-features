package com.srihari.java8.streams.l_partition;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10, Genre.ACTION),
                new Movie("d", 10, Genre.COMEDY),
                new Movie("c", 15, Genre.THRILLER),
                new Movie("a", 20, Genre.ACTION)
        );

        // partition by price greater than 10, a map with boolean key
        Map<Boolean, List<Movie>> partition =
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        movie -> movie.getPrice() > 10
                                )
                        );
        System.out.println(partition);

        // using second collector to join the movie names from above
        Map<Boolean, String> partition2 =
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        movie -> movie.getPrice() > 10,
                                        Collectors.mapping(
                                                Movie::getName,
                                                Collectors.joining(", ")
                                        )
                                )
                        );
        System.out.println(partition2);
    }
}
