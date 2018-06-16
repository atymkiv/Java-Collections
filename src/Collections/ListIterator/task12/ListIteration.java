package Collections.ListIterator.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void fill(List<Integer>list){
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
    }
    public static void main(String[]args){
        List<Integer> list1  = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(10);
        fill(list1);
        ListIterator<Integer> listIterator1 = list1.listIterator();

        System.out.println("List 1:");
        while (listIterator1.hasNext()){
            System.out.print(listIterator1.next()+" ");
        }
        while (listIterator1.hasPrevious()){
                int last = listIterator1.previous();
                list2.add(last);
            }
        ListIterator<Integer> listIterator2 = list2.listIterator();
        System.out.println("\nList 2: ");
            while (listIterator2.hasNext()){
                System.out.print(listIterator2.next()+" ");
            }
        }


}
