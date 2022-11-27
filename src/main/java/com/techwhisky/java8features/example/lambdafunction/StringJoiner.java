package com.techwhisky.java8features.example.lambdafunction;

import java.util.List;

@FunctionalInterface
public interface StringJoiner {

    public String concateWithDelimeter(List<String> list,String delimeter);
}
