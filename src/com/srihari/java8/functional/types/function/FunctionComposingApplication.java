package com.srihari.java8.functional.types.function;

import java.util.function.Function;

public class FunctionComposingApplication {
    public static void main(String[] args) {
        // convert "key:value" to "{key=value}"
        // Step 1 - "key:value" to "key=value"
        // Step 2 - "key=value" to "{key=value}"

        Function<String, String> replaceColen = str -> str.replace(":", "=");
        Function<String, String> addBrackets = str -> "{" +str+ "}";

        // andThen way
        var result = replaceColen
                        .andThen(addBrackets)
                        .apply("key:value");
        System.out.println(result);

        // Compose way - order of functions will be reversed
        result = addBrackets
                    .compose(replaceColen)
                    .apply("key:value");
        System.out.println(result);
    }
}
