package com.techwhisky.java8features.example.lambdafunction;

public class PrintableUtil {

    public static void main(String[] args) {
        Printable<String> printable=new PrintableImplWithImplementation();
        printable.print("hello, this is functional interface example with class implementation");
        System.out.println("-----------------------------");
        //second example with printable anonymous class implementation
        Printable<Integer> intPrintable=new Printable<Integer>() {
            @Override
            public void print(Integer integer) {
                System.out.println("this is example of anonymous class. value is "+integer);
            }
        };
        intPrintable.print(10);
        System.out.println("-----------------------------");
        //third example printable with lambda
        Printable<String> printableWithlambda=(m)-> System.out.println("this is implementation with lambda. value is "+m);
        printableWithlambda.print("lambda function");
    }
}
