package Collections.MainConceptions.Tasks2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection_Set {
    public static void main(String[]args){
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i:c) {
            System.out.print(i + ", ");

        }
    }
}
