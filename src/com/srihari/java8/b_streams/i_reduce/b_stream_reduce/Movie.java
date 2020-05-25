package com.srihari.java8.b_streams.i_reduce.b_stream_reduce;

public class Movie {
    private final String name;
    private final int price;

    public Movie(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
