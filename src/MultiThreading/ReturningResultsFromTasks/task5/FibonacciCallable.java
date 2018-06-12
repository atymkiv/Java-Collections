package MultiThreading.ReturningResultsFromTasks.task5;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<String> {
    private int count = 0;
    private int neededFibo;
    private int sumOfFibo = 0;
    private int currentFibo =0;
    public FibonacciCallable(int n){
        neededFibo = n;
    }
    private static int taskCount = 0;
    private final int id = taskCount++;
    public String status(){
        return "#" + (id+1)+ "thread "+ (count+1==neededFibo ? " Fibonacci ended = ":(count+"'s Fibonacci = "));
    }
    public Integer next() {
        currentFibo =fib(count++);
        return currentFibo;
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

        //System.out.println(status() + " Fibonacci ended");


    @Override
    public String call(){
        while (count!=neededFibo){
             next();
            sumOfFibo+=currentFibo;
            Thread.yield();
        }
        return "Sum of thread #" + (id+1)+" is "+sumOfFibo;
    }
}
    /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~


