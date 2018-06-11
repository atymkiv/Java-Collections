package MultiThreading.ThreadClass.task1;

public class SimpleRunnable implements Runnable{
    private static int taskCount = 0;
    private final int id = taskCount++;
    public SimpleRunnable(){
        System.out.println(id + "# Simple Runnable start");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(id + "# Simple Runnable " + i );
            Thread.yield();
        }
        System.out.println(id + "# Simple Runnable ended");
    }
}
