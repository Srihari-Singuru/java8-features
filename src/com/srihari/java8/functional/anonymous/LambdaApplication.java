package com.srihari.java8.functional.anonymous;

public class LambdaApplication {
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
