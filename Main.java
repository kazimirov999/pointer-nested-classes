public class Main {


    public static void main(String[] args) {

        Object[] objects = new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Collection collection = new Collection(objects);

        Iterator directZeroIterator = collection.getDirectZeroIterator();
        while (directZeroIterator.hasNext()) {
            System.out.println(directZeroIterator.next());
        }

        System.out.println("---------------------------------");

        Iterator reverseIterator = collection.getReverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("---------------------------------");

        Iterator reverseEveryThirdElementIterator = collection.getReverseEveryThirdElementIterator();
        while (reverseEveryThirdElementIterator.hasNext()) {
            System.out.println(reverseEveryThirdElementIterator.next());
        }

        System.out.println("----------------------------------------");

        collection.getFifthPairElement();

        System.out.println("-----------------------------------------");

        Iterator valEverySecondStaticPairsTransform = collection.getEverySecondStaticPairsTransform();
        while (valEverySecondStaticPairsTransform.hasNext()) {
            System.out.println(valEverySecondStaticPairsTransform.next());
        }


    }
}