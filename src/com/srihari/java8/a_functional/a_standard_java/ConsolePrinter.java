package com.srihari.java8.a_functional.a_standard_java;

public class ConsolePrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
