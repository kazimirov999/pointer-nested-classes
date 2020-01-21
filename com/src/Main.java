package src;

public class Main {

    public static void main(String[] args) {

        Collection FirstCollection = new Collection(new Integer[]{10, 11, 12, 13, 14, 15, 5, 4, 54, 185, 945, 645, 64, 6, 84, 68, 4, 684, 68, 4, 48, 684, 7165});
        Collection secondCollection = new Collection(new Integer[]{10, 11, 12, 13, 14, 15, 5, 4, 54, 185, 945, 645, 64, 6, 84, 68, 4, 684, 68, 4, 48, 684, 7165});
        Collection thirdCollection = new Collection(new Integer[]{10, 11, 12, 13, 14, 15, 5, 4, 54, 185, 945, 645, 64, 6, 84, 68, 4, 684, 68, 4, 48, 684, 7165});
        Collection fourthCollection = new Collection(new Integer[]{10, 11, 12, 13, 14, 15, 5, 4, 54, 185, 945, 645, 64, 6, 84, 68, 4, 684, 68, 4, 48, 684, 7165});
        Collection fifthCollection = new Collection(new Integer[]{10, 11, 12, 13, 14, 15, 5, 4, 54, 185, 945, 645, 64, 6, 84, 68, 4, 684, 68, 4, 48, 684, 7165});
        Iterator iterator = new Collection.FirstIteratorImplementator(thirdCollection.getIntegers()) {
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                printEveritThirdElementIfInEven(getIntegers());
                return getIntegers();

            }
        };
        System.out.println("First");
        Collection.FirstIteratorImplementator FirstImplementator = new Collection.FirstIteratorImplementator(FirstCollection.getIntegers());
        FirstImplementator.next();
        FirstImplementator.hasNext();


        System.out.println("\nSecond");
        Collection.secondIteratorImplementator secondImplementator = new Collection.secondIteratorImplementator(secondCollection.getIntegers());
        secondImplementator.next();

        System.out.println("\n Third");
        iterator.next();

        System.out.println("\n Fourth");
        IteratorForEveryFifthElement.InsideIterator.changeNumberIfItOdd(fifthCollection.getIntegers());
    }

    private static void printEveritThirdElementIfInEven(Integer[] ints) {
        for (int i = 0; i < ints.length; i += 3) {
            if (ints[i] % 2 != 0) {
                System.out.println(ints[i]);
            }
        }
    }
}
