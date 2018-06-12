package MultiThreading.ReturningResultsFromTasks.task5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciCallableDemo {
    public static void main(String[]args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            results.add(exec.submit(new FibonacciCallable(i)));
        System.out.println("Waiting for Fibonacci");
        for (Future<String> sumOfFibo:results) {
            try {
                System.out.println(sumOfFibo.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }
    }

}
