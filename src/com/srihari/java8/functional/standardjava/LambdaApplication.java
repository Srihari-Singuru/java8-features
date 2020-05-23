package com.srihari.java8.functional.standardjava;

public class LambdaApplication {
    public static void main(String[] args) {
        greet(new ConsolePrinter());
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
