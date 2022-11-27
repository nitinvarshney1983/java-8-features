package com.techwhisky.java8features.example.inbuiltfunctionalinterfaces;

import java.util.function.Consumer;

public class ConsumerUtil {
    public static void main(String[] args) {

        //a simple consumer printing some message
        Consumer<Integer> consumer=(num)-> System.out.println("number is "+num);
        consumer.accept(10);
        System.out.println("--------------------------------");
        Consumer<Integer> consumer1=(num)-> System.out.println("square of number  is "+(num*num));
        consumer1.accept(10);
        System.out.println("--------------------------------");
        //chaining on different consumers
        consumer.andThen(consumer1).accept(10);
    }
}
