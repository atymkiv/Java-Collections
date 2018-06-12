package MultiThreading.ExecutorUsing.task3;

import MultiThreading.ThreadClass.task1.SimpleRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class task1Cached {
    public static void main(String[]args){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new SimpleRunnable());
        exec.shutdown();
    }
}
