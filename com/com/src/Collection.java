package com.src;

import java.util.Iterator;

public class Collection {

    private Object[] objects;

    public Collection(Object[] objects) {
        this.objects = objects;
    }

    public DirectTwinIterator directIterator() {
        return new DirectTwinIterator();
    }

    public class DirectTwinIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public Object next() {
            if (index % 2 == 0) {
                return objects[index++];
            }
            index++;
            return null;
        }
    }
}

