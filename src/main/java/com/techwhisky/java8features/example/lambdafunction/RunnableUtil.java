package com.techwhisky.java8features.example.lambdafunction;

public class RunnableUtil {


    public static void main(String[] args) {


        //simple way
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("Normal way implementation of runnable. sum is "+sum);
                System.out.println("------------------------------");
            }
        };
        Thread t=new Thread(runnable);
        t.start();

        //another way
        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("Combined implementation and calling of runnable. sum is "+sum);
                System.out.println("------------------------------");
            }
        }).start();

        new Thread(()->{
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("lambda implementation of runnable. sum is "+sum);
        }).start();

    }


}
