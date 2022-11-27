package com.techwhisky.java8features.example.lambdafunction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableUtil {
    private static final int[] array= IntStream.rangeClosed(0,5000).toArray();
    private static final int total= IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Callable to add first 2500 numbers
        Callable<Integer> callable=()->{
          int sum=0;
          for(int i=0;i<array.length/2;i++){
              sum+=i;
          }
          return sum;
        };
        //callable to add another 2500 numbers
        Callable<Integer> callable1=()->{
            int sum=0;
            for(int i=array.length/2;i<array.length;i++){
                sum+=i;
            }
            return sum;
        };

        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures=executorService.invokeAll(Arrays.asList(callable,callable1));

        int k=0;
        int sum=0;
        for(Future<Integer> integerFuture:futures){
            sum=sum+integerFuture.get();
            System.out.println("sum of "+ integerFuture.toString() +" numbers is "+integerFuture.get());
        }
        System.out.println("sum from callables "+sum);
        System.out.println("sum from int stream "+ total);
        executorService.shutdown();
    }
}
