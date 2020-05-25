package com.srihari.java8.b_streams.e_slice;

import java.util.List;

public class SliceApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Limiting number of elements from Stream
        list.stream()
                .limit(2)
                .forEach(movie -> System.out.println(movie.getName()));

        // Skip first two items
        list.stream()
                .skip(2)
                .forEach(movie -> System.out.println(movie.getName()));

        // Pagination
        /*
        Assume we have 1000 movies
        10 movies per page
        we want 3rd page
        then, skip(20)      -- skip((page-1) * pageSize) -- skip((3-1) * 10)
        limit(10)           -- limit(pageSize)
         */
        list.stream()
                .skip(20)
                .limit(10)
                .forEach(movie -> System.out.println(movie.getName()));

        // takeWhile - stop as soon as the Predicate returns false
        // Doesn't care about the remaining elements
        list.stream()
                .takeWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getName()));

        // dropWhile - opposite to takeWhile
        list.stream()
                .dropWhile(movie -> movie.getLikes() < 10)  // will not print the first element
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
