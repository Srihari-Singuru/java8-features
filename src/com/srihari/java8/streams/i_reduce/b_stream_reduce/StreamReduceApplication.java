package com.srihari.java8.streams.i_reduce.b_stream_reduce;

import java.util.List;

public class StreamReduceApplication {
    public static void main(String[] args) {
        List<Movie> list = List.of(
                new Movie("b", 10),
                new Movie("d", 10),
                new Movie("c", 15),
                new Movie("a", 20)
        );

        // to sum up all the prices of movies
        list.stream()
                .map(Movie::getPrice)
                .reduce(Integer::sum);      // returns sum of all prices - Optional
                //reduce((a, b) -> a + b);
    }
}
