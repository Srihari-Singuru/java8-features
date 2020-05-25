package com.srihari.java8.streams.m_primitive_stream;

import java.util.stream.IntStream;

/**
 * Everything will be same as general Streams
 */
public class PrimitiveStreamApplication {
    public static void main(String[] args) {
        //IntStream.range(1, 5) // 5 is not included
        IntStream.rangeClosed(1, 5)     // rangeClosed means, upperbound is inclusive
                    .forEach(System.out::println);
    }
}
