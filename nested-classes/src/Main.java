public class Main {
    public static void main(String[] args) {
        Collection someCollection = new Collection(new Integer[]{1, 2, 88, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 66});
        Iterator ascendingOrderIterator = someCollection.new AscendingOrderIterator();
        Iterator descendingOrderIterator = someCollection.new DescendingOrderIterator();
        Iterator anonIterator = new Iterator() {
            private int count = someCollection.array.length - 1;

            @Override
            public boolean hesNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                int a = 0;
                while (a == 0 && count > 0) {
                    if (someCollection.array[count] % 2 != 0) {
                        a = someCollection.array[count];
                    }
                    count -= 3;
                }
                count -= 3;
                return a;
            }
        };
        Iterator localIterator = someCollection.new LocalIterator();
        Iterator statikIterator = new Collection.StatikIterator();


        display(ascendingOrderIterator);
        display(descendingOrderIterator);
        display(anonIterator);
        display(localIterator);
        display(statikIterator);

    }


    static void display(Iterator iterator) {
        while (iterator.hesNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n" + "-------------------------------------------------------------");
    }
}
