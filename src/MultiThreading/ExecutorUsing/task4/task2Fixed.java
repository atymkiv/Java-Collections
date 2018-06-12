package MultiThreading.ExecutorUsing.task4;

import MultiThreading.ThreadClass.task2.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class task2Fixed {
    public static void main(String[]args){
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.execute(new Fibonacci(i));
        }
        exec.shutdown();
    }
}
