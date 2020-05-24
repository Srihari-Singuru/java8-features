package com.srihari.java8.functional.types.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/**
 * Supplier - takes nothing and returns something
 * like Consumer, Supplier also has primitive support like IntSupplier, DoubleSupplier etc.
 */
public class SupplierApplication {
    public static void main(String[] args) {
        Supplier<Double> getRandom = Math::random;  // Lazy
        //DoubleSupplier getDoubleRandom = Math::random;    // We can even use this which eliminates autoboxing cost

        var random = getRandom.get();   // random will be generated at this point of time
        System.out.println(random);
    }
}
