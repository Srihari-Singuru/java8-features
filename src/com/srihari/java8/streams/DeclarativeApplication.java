package com.srihari.java8.streams;

import java.util.List;

public class DeclarativeApplication {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("movie1", 10),
                new Movie("movie2", 15),
                new Movie("movie3", 20)
        );

        // Imperative way to count the number of movies where likes are greater than 10
        long count = 0;
        for(var movie : movies){
            if(movie.getLikes() > 10){
                count++;
            }
        }
        System.out.println(count);

        // Declarative/Functional way
        count = movies.stream()
                        .filter(movie -> movie.getLikes() > 10)
                        .count();
        System.out.println(count);
    }
}
