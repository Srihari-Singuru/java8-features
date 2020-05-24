package com.srihari.java8.functional.types.predicate;

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
