package com.srihari.java8.streams.i_reduce.a_simple_reduce;

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
