package com.srihari.java8.streams.k_grouping;

public class Movie {
    private final String name;
    private final int price;
    private final Genre genre;

    public Movie(String name, int price, Genre genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Genre getGenre() {
        return genre;
    }
}
