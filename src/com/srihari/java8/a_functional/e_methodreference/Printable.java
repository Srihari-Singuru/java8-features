package com.srihari.java8.a_functional.e_methodreference;

// Only one abstract method, but can have many default methods with implementation
@FunctionalInterface
public interface Printable {
    void print(String message);
}
