package MultiThreading.Threads_Deamon;

import java.util.concurrent.TimeUnit;

//Потоки-демони не перешкоджають завершенню роботи програми
public class SimpleDeamons implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[]args)throws Exception{
        for (int i = 0; i <10; i++) {
            Thread daemon = new Thread(new SimpleDeamons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(129);
    }
}
