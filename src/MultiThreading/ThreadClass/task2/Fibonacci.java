package MultiThreading.ThreadClass.task2;
//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
public class Fibonacci implements Runnable{
    private int count = 0;
    private int neededFibo;
    public Fibonacci(int n){
        neededFibo = n;
    }
    private static int taskCount = 0;
    private final int id = taskCount++;
    public String status(){
        return "#" + (id+1)+ "thread "+ (count+1==neededFibo ? " Fibonacci ended = ":(count+"'s Fibonacci = "));
    }
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public void run() {
        while (count!=neededFibo){
            System.out.println(status() + next());
            Thread.yield();
        }
        //System.out.println(status() + " Fibonacci ended");
    }
}
    /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~

