package MultiThreading.ThreadClass.task1;

public class SomeBasicThreads {
    public static void main(String[]args){
        for (int i = 0; i < 2; i++) {
            new Thread(new SimpleRunnable()).start();
            System.out.println("Waiting for Simple Runnable");
        }
    }
}
