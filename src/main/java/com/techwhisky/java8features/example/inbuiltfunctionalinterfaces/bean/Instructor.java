package com.techwhisky.java8features.example.inbuiltfunctionalinterfaces.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class Instructor {
    private String name;
    private String title;
    private int yearOfExperience;
    private String gender;
    private boolean onlineCourses;
    private List<String> courses;


}
