package com.src;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Collection collection = new Collection(new Integer[]{10, 14, 18,19,44,37, 73});


        Iterator iterator = collection.directIterator();
        Iterator iterator2 = collection.directIterator();
        display(iterator);
        display(iterator2);

    }


    static void display(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
