public class Main {

    public static void main(String[] args) {

        Collection someCollection = new Collection(new Integer[]{0, 100, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});

        Iterator ascendingOrderIterator = someCollection.new AscendingOrderIterator();
        Iterator descendingOrderIterator = someCollection.new DescendingOrderIterator();
        Iterator anonIterator = new Iterator() {
            private int count = someCollection.array.length - 1;

            @Override
            public boolean hesNext() {
                return count >= 0;
            }

            @Override
            public Integer next() {
                if (((someCollection.array.length - 1) % 2) == 0) {
                    if ((someCollection.array[count] % 2) != 0) {
                        count -= 3;
                        return someCollection.array[count + 3];
                    }
                } else if (((someCollection.array.length - 1) % 2) != 0) {
                    if ((someCollection.array[count] % 2) != 0) {
                        count -= 3;
                        return someCollection.array[count + 3];
                    }
                }
                count -= 3;
                return null;
            }
        };
        Iterator localIterator = someCollection.new LocalIterator();
        Iterator staticIterator = new Collection.StaticIterator();

        display(ascendingOrderIterator);
        display(descendingOrderIterator);
        display(anonIterator);
        display(localIterator);
        display(staticIterator);

    }

    static void display(Iterator iterator) {
        while (iterator.hesNext()) {
            Integer flajok = iterator.next();
            if (flajok != null) {
                System.out.print(flajok + " ");
            }
        }
        System.out.println("\n" + "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
