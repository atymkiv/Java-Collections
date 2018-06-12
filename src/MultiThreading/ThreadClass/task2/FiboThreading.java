package MultiThreading.ThreadClass.task2;

public class FiboThreading {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new Thread(new Fibonacci(i)).start();
        System.out.println("Waiting for Fibonacci");
    }
}
