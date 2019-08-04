public class Main {

    public static void main(String[] args) {
        Object[] objects = new Object[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100};
        Collection collection = new Collection(objects);

        System.out.println("---------------1------------------");

        Iterator iterator = collection.getDirectZeroForOddIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------2------------------");

        Iterator iterator2 = collection.getReverseThroughOneIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("----------------3------------------");

        collection.getReversePrintEveryThirdOddIterator();

        System.out.println("---------------4-------------------");

        collection.directEveryEvenFifthIteratorSubtractHundred();

        System.out.println("----------------5-------------------");

        Iterator iterator3 = collection.getDirectEverySecondToNotOdd();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }


    }
}
