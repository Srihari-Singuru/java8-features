package com.srihari.java8.a_functional.f_interface_types.e_special_function;

import java.util.function.UnaryOperator;

/**
 * UnaryOperator is type of Function
 * UnaryOperator - T apply(T t);
 * IntUnaryOperator
 * etc.
 */
public class UnaryOperatorApplication {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x+1;
        UnaryOperator<Integer> square = x -> x*x;

        var result = increment
                        .andThen(square)
                        .apply(1);
        System.out.println(result);
    }
}
