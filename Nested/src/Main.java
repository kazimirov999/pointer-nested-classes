public class Main {
    public static void main(String[] args) {
        Collection someCollection = new Collection(new Integer[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 10, 20, 30, 40, 50, 60, 70, 80, 90});
        Iterator firstTaskIterator = someCollection.new FirstTaskIterator();
        Iterator secondTaskIterator = someCollection.new SecondTaskIterator();
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
        Iterator thirdTaskIterator = someCollection.new ThirdTaskIterator();
        Iterator fourthTaskIterator = new Collection.FourthTaskIterator();


        display(firstTaskIterator);
        display(secondTaskIterator);
        display(anonIterator);
        display(thirdTaskIterator);
        display(fourthTaskIterator);

    }
    static void display(Iterator iterator) {
        while (iterator.hesNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n" + "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}

