package MultiThreading.Sleep.task6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task6Run {
    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        int quantityOfTasks = Integer.parseInt(args[0]);
        for (int i = 0; i < quantityOfTasks; i++) {
            exec.execute(new Task6(i));
        }
        exec.shutdown();
    }
}
