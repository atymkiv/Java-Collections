package Collections.GenericsAndUpcasting.task1;

import java.util.ArrayList;

public class GerbilMain {
    public static void main(String[]args){
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (Gerbil gerb:gerbils) {
            System.out.println(gerb.hop());
        }
    }
}
