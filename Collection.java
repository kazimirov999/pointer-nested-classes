package com.NestedClass;

public class Collection {
    public static Integer[] mass;


    public Collection(Integer[] mass) {
        this.mass = mass;
    }

    public OddIterator directIterator() {
        return new OddIterator();
    }


    class OddIterator implements Iterator {

        private int nowIndex;

        @Override
        public boolean hasNext() {
            return nowIndex < mass.length;
        }

        @Override
        public Object next() {
            if (nowIndex % 2 == 0) {
                return mass[nowIndex++];
            }
            nowIndex++;
            return 0;
        }
    }

    class AfterOneIterator implements Iterator {
        private int nowIndex = mass.length - 1;


        @Override
        public boolean hasNext() {
            return nowIndex > 0;

        }

        @Override
        public Object next() {
            int m = 0;
            m = mass[nowIndex];
            nowIndex -= 2;
            return m;
        }
    }

    public class every5 implements Iterator {
        private int nowIndex = 0;

        @Override
        public boolean hasNext() {
            return nowIndex < mass.length;
        }

        @Override
        public Object next() {
            int m = 0;
            for (m = 0; m < mass.length; nowIndex++) {
                if ((nowIndex + 1) % 5 == 0 && mass[nowIndex] % 2 == 0) {
                    m = mass[nowIndex] - 100;
                }
            }
            return m;
        }
    }

    public class each2 implements Iterator {
        private int nowIndex;

        @Override
        public boolean hasNext() {
            return nowIndex < mass.length;
        }

        @Override
        public Object next() {
            int m;
            for (m = 0; m < mass.length; nowIndex += 2) {

                if (mass[nowIndex] % 2 == 0) {
                    m = mass[nowIndex] - 1;
                }

            }
            return m;
        }
    }


}