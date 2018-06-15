package Collections.Iterator.task1;

import java.util.Iterator;

public class Gebril {
    private int gerbilNumber;
    private static int counter = 1;
    private final int id = counter++;
    public Gebril(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public static void hop(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString() {
        return "Gebril id: " + id + " Gebril number: "+ gerbilNumber;
    }
}
