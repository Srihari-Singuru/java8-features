package com.srihari.java8.a_functional.c_lambda;

// Only one abstract method, but can have many default methods with implementation
@FunctionalInterface
public interface Printable {
    void print(String message);
}
