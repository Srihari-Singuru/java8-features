package com.srihari.java8.functional.lambda;

public class PrinterApplication {
    public static void main(String[] args) {
        greet(message -> System.out.println(message));
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
