package com.techwhisky.java8features.example.inbuiltfunctionalinterfaces;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class NumberConsumerUtil {
    public static void main(String[] args) {
        IntConsumer intConsumer=(intNumber)-> System.out.println("int num is: "+intNumber);
        DoubleConsumer doubleConsumer=(doubleNumber)-> System.out.println("double number is: "+doubleNumber);
        LongConsumer longConsumer=(longNumber)-> System.out.println("long number is: "+longNumber);

        intConsumer.accept(10);
        doubleConsumer.accept(10.0);
        longConsumer.accept(10L);
    }
}
