package com.techwhisky.java8features.example.lambdafunction;

import java.util.Arrays;
import java.util.List;

public class StringJoinerUtil {

    public static void main(String[] args) {
        StringJoiner stringJoiner = (l1, d) -> {
            final StringBuilder concatedString = new StringBuilder();
            l1.forEach(element -> {
                concatedString.append(d).append(element);
            });
            return concatedString.toString();
        };
        List<String> list = Arrays.asList("Nitin", "is", "a", "java", "developer");
        String joinedList=stringJoiner.concateWithDelimeter(list, " ");
        System.out.println(joinedList);
    }

}
