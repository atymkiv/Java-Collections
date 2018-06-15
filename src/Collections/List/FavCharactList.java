package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Character{
    private String name;
    private int age;
    public Character(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
public class FavCharactList {
    public static void main(String[]args) {
        Character floki = new Character("Floki");
        Character ragnar = new Character(("Ragnar"));
        Character rollo = new Character("Rollo");
        Character ivory = new Character("Ivory");
        List<Character> characters = new ArrayList<>(Arrays.asList(floki,ragnar,rollo,ivory));
        System.out.println("Primary list: "+characters);
        List<Character> sub = characters.subList(0, 2);

        System.out.println("sublist is " + sub);
        characters.removeAll(sub);
        System.out.println("List after deletion of sub: "+characters);

    }
}
