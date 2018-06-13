package MultiThreading.Sleep.task6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Task6 implements Runnable {
    private static int taskCount = 0;
    private int id = taskCount++;
    static int randomNum = 0;
    int n = 0;
    int  curr = 0;
    int min = 1000;
    int max = 10000;
    private static int sleepTime = 0;
    public Task6(int quantity){
        n = quantity;
    }
    public String status() {

        return "#" + (id ) + "thread " + (curr < n ? "message "+curr++:"thread ended");
    }
    @Override
    public void run() {
        while (curr!=n) {
            System.out.println(status());
             randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("SleepTime of thread #"+(id) + " is: " + (randomNum*0.001)+" sec");
            try {
                TimeUnit.MILLISECONDS.sleep(randomNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                Thread.yield();
            }

        }

    }
}
