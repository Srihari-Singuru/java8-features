package com.srihari.java8.functional.variablescope;

public class PrinterApplication {
    // Lambda can access static fields
    private static final String suffix = "Jr.";

    // Lambda can also access instance fields, however the calling method should be non-static (general java)
    private String comments;

    public static void main(String[] args) {
        var prefix = "Mr."; // lambda can access local variables
        greet(message -> {
            System.out.println(prefix+message+suffix);

            // 'this' can be used in lambda expression (method should not be static (general java))
            // 'this' refers to current instance of 'PrintApplication'
            // But in Anonymous, 'this' refers to the inner anonymous object
            //System.out.println(this.comments);
        });
    }

    public static void greet(Printable printable) {
        printable.print("Hello Srihari!");
    }
}
