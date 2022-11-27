package com.techwhisky.java8features.example.inbuiltfunctionalinterfaces;

import com.techwhisky.java8features.example.inbuiltfunctionalinterfaces.bean.Instructor;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){

        return Arrays.asList(
                new Instructor("Nitin Varshney",
                        "Software Developer",
                        14,
                        "M",
                        true,
                        Arrays.asList("Java Programming","C++ Programming","Python Programming")),
                new Instructor("Jenny",
                        "Engineer",
                        5,
                        "F",
                        false,
                        Arrays.asList("Multi-threaded Programming","CI/CD","Unit testing")),
                new Instructor("Gene",
                        "Manager",
                        6,
                        "M",
                        false,
                        Arrays.asList("React Programming","Angular programming","Python Programming")),
                new Instructor("Anthony",
                        "Senior Software Developer",
                        15,
                        "M",
                        true,
                        Arrays.asList("Java Programming","C++ Programming","Python Programming")),
                new Instructor("Ashish Gupta",
                        "Software Architect",
                        16,
                        "M",
                        true,
                        Arrays.asList("Java Programming","C++ Programming","Python Programming")));
    }
}
