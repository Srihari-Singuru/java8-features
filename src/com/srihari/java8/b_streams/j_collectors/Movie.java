package com.srihari.java8.b_streams.j_collectors;

public class Movie {
    private final String name;
    private final int price;

    public Movie(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
