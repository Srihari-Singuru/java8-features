package com.srihari.java8.functional.a_standard_java;

public class PrinterApplication {
    public static void main(String[] args) {
        greet(new ConsolePrinter());
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
