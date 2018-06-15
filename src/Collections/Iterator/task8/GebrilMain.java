package Collections.Iterator.task8;

import java.util.ArrayList;
import java.util.Iterator;

public class GebrilMain {
    public static void main(String[]args){
        ArrayList<Gebril> gerbils = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gerbils.add(new Gebril(i));
        }
        Iterator iterator = gerbils.iterator();
        Gebril.hop(iterator);
    }

}
