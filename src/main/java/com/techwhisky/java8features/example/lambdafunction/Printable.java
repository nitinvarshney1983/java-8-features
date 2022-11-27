package com.techwhisky.java8features.example.lambdafunction;

@FunctionalInterface
public interface Printable<T> {

    public void print(T t);
}
