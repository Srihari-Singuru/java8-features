package com.srihari.java8.a_functional.b_anonymous;

public class PrinterApplication {
    public static void main(String[] args) {
        greet(new Printable() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
