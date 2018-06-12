package MultiThreading.ReturningResultsFromTasks;

import java.util.concurrent.Callable;

public class TestWithResult implements Callable<String>{
    private int id;
    public TestWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() {
        return "result of TaskWithResult " + id;
    }
}
