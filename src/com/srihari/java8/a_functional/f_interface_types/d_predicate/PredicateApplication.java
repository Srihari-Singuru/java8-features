package com.srihari.java8.a_functional.f_interface_types.d_predicate;

import java.util.function.Predicate;

/**
 * Predicate    - takes an argument and returns boolean
 * Predicate    - boolean test(T t);
 * BiPredicate  - boolean test(T t, U u);
 * IntPredicate - boolean test(int value);
 * LongPredicate
 * DoublePredicate
 */
public class PredicateApplication {
    public static void main(String[] args) {
        Predicate<String> isLongerThan3 = str -> str.length() > 3;

        var result = isLongerThan3.test("Srihari");
        System.out.println(result);
    }
}
