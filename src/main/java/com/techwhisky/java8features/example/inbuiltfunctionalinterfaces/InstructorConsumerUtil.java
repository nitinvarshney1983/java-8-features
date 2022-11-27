package com.techwhisky.java8features.example.inbuiltfunctionalinterfaces;

import com.techwhisky.java8features.example.inbuiltfunctionalinterfaces.bean.Instructor;

import java.util.List;
import java.util.function.Consumer;

public class InstructorConsumerUtil {

    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();

        //using consumer to print all instructor
        Consumer<Instructor> consumer1=(instructor)-> System.out.println(instructor);
        instructors.forEach(consumer1);
        System.out.println("---------------------------");
        //Print only Name
        Consumer<Instructor> consumer2=(instructor)-> System.out.println(instructor.getName());
        instructors.forEach(consumer2);

        System.out.println("----------------------------");
        //print name and courses using old consumer
        Consumer<Instructor> consumer3=(instructor -> System.out.println(instructor.getCourses()));
        instructors.forEach(consumer2.andThen(consumer3));

        System.out.println("------------------------------");
        //print name of instructor if year of exp is more than 10
        Consumer<Instructor> consumer4=(instructor)->{
            if(instructor.getYearOfExperience()>10){
                consumer2.accept(instructor);
            }
        };
        instructors.forEach(consumer4);
        System.out.println("------------------------------");
        //print name of instructor and courses if year of exp is more than 5 and teaches course online
        instructors.forEach(instructor -> {
           if(instructor.getYearOfExperience()>5 && instructor.isOnlineCourses()){
               consumer2.andThen(consumer3).accept(instructor);
           }
        });
    }

}
