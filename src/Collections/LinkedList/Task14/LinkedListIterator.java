package Collections.LinkedList.Task14;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[]args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        for (int i = 0; i < 10; i++) {
          listIterator.add(0);
        }
        listIterator = linkedList.listIterator(4);
        listIterator.next();
        for (int i = 1; i <= 10; i++) {
            listIterator.add(i);
            System.out.println(linkedList + " Розмір = " + linkedList.size());


        }


    }
}
