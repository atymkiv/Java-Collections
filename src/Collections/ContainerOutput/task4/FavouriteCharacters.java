package Collections.ContainerOutput.task4;

import java.util.*;

public class FavouriteCharacters {
    static int id = 0;
    public static String nextByIndex(Collection<String> collection, int index){
        id = index;
        Iterator iterator = collection.iterator();
            for (int i = 0; i < id%collection.size(); i++) {
                iterator.next();
            }
            return (String) iterator.next();
    }
    public static Collection fill(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Rollo");
        collection.add("Ragnar");
        collection.add("Ivory");
        collection.add("Floki");
        return collection;
    }
    public static void main(String[]args){
        Collection<String> characters1 = new ArrayList<>();
        Collection<String> characters2 = new LinkedList<>();
        Collection<String> characters3 = new HashSet<>();
        characters1.addAll(fill());
        characters2.addAll(fill());
        characters3.addAll(fill());
        for (int i = 0; i < characters1.size()+1; i++) {
            System.out.println(nextByIndex(characters1, i));
        }
        System.out.println(characters1);
        System.out.println(characters2);
        System.out.println(characters3);
    }
}
