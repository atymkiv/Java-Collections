package Collections.Iterator.task9;

import java.util.Iterator;

public class SequenceWithIterator {
    private Object[] items;
    private int next = 0;
    public SequenceWithIterator(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceIterator implements Iterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i<items.length;
        }

        @Override
        public Object next() {
            return items[i++];
        }
    }
    public SequenceIterator iterator() {
        return new SequenceIterator();
    }
    public static void main(String[] args) {
        int size = 50;
        SequenceWithIterator sequence = new SequenceWithIterator(size);
        for(int i = 0; i < size; i++)
            sequence.add(Integer.toString(i));
        SequenceIterator iterator = sequence.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}