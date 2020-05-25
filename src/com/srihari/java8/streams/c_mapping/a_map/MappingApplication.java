package com.srihari.java8.streams.c_mapping.a_map;

import java.util.List;

public class MappingApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Print just movie names
        list
            .stream()
            .map(Movie::getName)    // We can eve use mapToInt etc.. (which will epect ToIntFunction instead of Function)
            //.mapToInt(Movie::getLikes)
            .forEach(System.out::println);
    }
}
