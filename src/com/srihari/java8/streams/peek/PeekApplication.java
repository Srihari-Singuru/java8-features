package com.srihari.java8.streams.peek;

import java.util.List;

public class PeekApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("d", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        // Peeking/debugging
        list.stream()
                .filter(movie -> movie.getPrice() > 10)
                .peek(movie -> System.out.println("Filtered: "+movie.getName()))    // kind of debug statements
                .map(Movie::getName)
                .peek(name -> System.out.println("Mapped: "+name))
                .forEach(System.out::println);
    }
}
