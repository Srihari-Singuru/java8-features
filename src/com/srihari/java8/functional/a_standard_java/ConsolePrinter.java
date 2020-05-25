package com.srihari.java8.functional.a_standard_java;

public class ConsolePrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
