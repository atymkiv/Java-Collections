package Collections.ContainerOutput.task4;

import java.util.*;

public class FavouriteCharacters {
    private int id = 0;
    public static String next(Collection<String> collection){
        Iterator iter = collection.iterator();
        Iterator iter2 = collection.iterator();
        if (iter.hasNext())
            return (String)iter.next();
        else
            return (String) iter2.next();
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
            System.out.println(next(characters1));
        }
    }
}
