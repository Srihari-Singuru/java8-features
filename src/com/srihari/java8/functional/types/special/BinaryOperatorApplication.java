package com.srihari.java8.functional.types.special;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * BinaryOperator is type of BiFunction
 * BinaryOperator - T apply(T t, T u);
 * IntBinaryOperator
 * etc.
 */
public class BinaryOperatorApplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum;    // (a, b) -> a+b
        //IntBinaryOperator add = Integer::sum;    // We can use this to eliminate autoboxing cost
        var result = add.apply(1, 2);
        System.out.println(result);

        // We can chain/combine multiple functions
        Function<Integer, Integer> square = a -> a*a;   // We can use UnaryOperator here; T apply(T t);
        result = add
                    .andThen(square)
                    .apply(1, 2);
        System.out.println(result);
    }
}
