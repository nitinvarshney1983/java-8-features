package com.techwhisky.java8features.example.lambdafunction;

public class PrintableImplWithImplementation implements Printable<String>{


    @Override
    public void print(String message) {
        System.out.println("message is "+message);
    }
}
