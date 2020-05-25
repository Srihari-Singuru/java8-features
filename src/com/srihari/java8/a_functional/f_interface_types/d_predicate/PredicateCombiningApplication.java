package com.srihari.java8.a_functional.f_interface_types.d_predicate;

import java.util.function.Predicate;

public class PredicateCombiningApplication {
    public static void main(String[] args) {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);   // We can use 'and' 'or' etc.
        var result = hasLeftAndRightBrace.test("{key:value}");
        System.out.println(result);
    }
}
