package Collections.Iterator.task11;

import java.util.*;

public class CollectionIterator {
    public static void main(String[]args){
        Collection<Integer> collectionAL = new ArrayList<>();
        Collection<Integer> collectionLL = new LinkedList<>();
        Collection<Integer> collectionHS = new HashSet<>();
        fill(collectionAL);
        fill(collectionLL);
        fill(collectionHS);
        System.out.print("ArrayList print: ");
        print(collectionAL);
        System.out.print("LinkedList print: ");
        print(collectionLL);
        System.out.print("HashSet print: ");
        print(collectionHS);
    }
    public static void fill(Collection<Integer> collection){
        for (int i = 0; i <10 ; i++) {
            collection.add(i);
        }
    }
    public static void print(Collection<Integer> collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
