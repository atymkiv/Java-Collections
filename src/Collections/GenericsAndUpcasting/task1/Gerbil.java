package Collections.GenericsAndUpcasting.task1;

public class Gerbil {
    private int gerbilNumber;
    private static int counter = 1;
    private final int id = counter++;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public String hop(){
        return gerbilNumber + " this is Gerbil's"+ id+" number";
    }
}
