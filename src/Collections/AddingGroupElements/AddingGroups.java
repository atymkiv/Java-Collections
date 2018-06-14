package Collections.AddingGroupElements;

import java.util.*;

public class AddingGroups {
    public static void main(String[]args){
        Collection <Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // можна використовувати конструктор для заповнення колекції
        Integer [] moreInts = { 6, 7, 8, 9, 10};
        Collections.addAll(Arrays.asList(moreInts)); // Працює значно швидше проте контейнер так зконструювати неможливо
        Collections.addAll(collection,11,12,13,14,15); // метод для заповенння контейнера елементами
        Collections.addAll(collection,moreInts); // метод для заповеннян контейнера іншим контейнером такого ж типу
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99); // змінює елемент з індексом 1

    }
}
