package com.srihari.java8.functional.e_methodreference;

public class PrinterApplication {

    // Default Constructor
    public PrinterApplication() {
    }

    // Parameterized Constructor
    public PrinterApplication(String message) {
    }

    public static void main(String[] args) {
        greet(System.out::println); // greet(message -> System.out.println(message));

        // If we have a static method in PrinterApplication
        greet(PrinterApplication::print1);  // greet(message -> PrinterApplication.print1(message));

        // If we have a instance method in PrinterApplication
        var app = new PrinterApplication();
        greet(app::print2); // greet(message -> app.print2(message));

        // If we want to invoke a default constructor
        greet(message -> new PrinterApplication());

        // If we want to invoke a parameterized constructor
        greet(PrinterApplication::new); // greet(message -> new PrinterApplication(message));
    }

    // Example method for depicting method reference
    public static void print1(String message) {
        System.out.println(message);
    }

    // Example method for depicting method reference
    public void print2(String message) {
        System.out.println(message);
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
