package Collections.LinkedList.Task14;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[]args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        int index=0;
        for (int i = 0; i < 20; i++) {
            index= linkedList.size()/2;
            if (index>0){
                listIterator = linkedList.listIterator(index);
            }
          listIterator.add(i);
            System.out.println(linkedList + " Розмір = " + linkedList.size());
        }
    }
}
