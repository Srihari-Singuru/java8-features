package com.srihari.java8.functional.types.function;

import java.util.function.Function;

/**
 * Function - takes an argument and returns an object
 * Function             - R apply(T t);
 * BiFunction           - R apply(T t, U u);
 * IntFunction          - R apply(int value);
 * ToIntFunction        - int applyAsInt(T value);
 * IntToLongFunction    - long applyAsLong(int value);
 *
 * Like above, we have for all primitive types
 */
public class FunctionApplication {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;    // str -> str.length();

        var length = function.apply("Srihari");
        System.out.println(length);
    }
}
