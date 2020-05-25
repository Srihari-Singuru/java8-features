package com.srihari.java8.b_streams.c_mapping.a_map;

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
