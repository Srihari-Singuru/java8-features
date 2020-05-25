package com.srihari.java8.streams.d_filter;

public class Movie {
    private final String name;
    private final int likes;

    public Movie(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public int getLikes() {
        return likes;
    }
}
