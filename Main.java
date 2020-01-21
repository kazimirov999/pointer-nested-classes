package com.NestedClass;
public class Main {

    public static void main(String[] args) {

        Collection collections = new Collection(new Integer[]{1600, 6, 59, 766, 568, 19, 14, 17,89});

        Iterator iterator = collections.directIterator();
        Iterator iterator1 = collections.new AfterOneIterator();
        Iterator iterator2 = collections.new every5();
        Iterator iterator3 = collections.new each2();
        Iterator anonimIterator = new Iterator() {
            private int nowIndex = collections.mass.length-1;

            @Override
            public boolean hasNext() {
                return nowIndex > 0;
            }

            @Override
            public Integer next() {
                int m ;

                for (m=collections.mass.length; nowIndex >=1; nowIndex-=3) {
                    if (collections.mass[nowIndex] % 2 != 0) {
                        m = collections.mass[nowIndex];
                    }

                }

                return m;
            }
        };

        display(iterator);
        display(iterator1);
        display(iterator2);
        display(iterator3);
        display(anonimIterator);
    }




    static void display(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println("\n" + "-------------------------------------------------------------");

        }
    }


}
