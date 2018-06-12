package MultiThreading.ExecutorUsing;

import MultiThreading.ProgramDefinition.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[]args){
        //аргумент конструктора - число потоків
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
