package com.srihari.java8.functional.standardjava;

public class ConsolePrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
