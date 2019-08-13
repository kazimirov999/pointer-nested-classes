package com.encoding;

public class Main {

    public static void main(String[] args) {
                                       //0   1     2    3    4    5    6    7
        Object[] objects = new Object[]{100, 200, 300, 400, 500, 600, 700, 800};

        Collection collection = new Collection(objects);

        Iterator directIterator = collection.getDirectIterator();
        while (directIterator.hasNext()){
            System.out.println(directIterator.next());
        }

        System.out.println("---------------------------------");

        Iterator reverseIterator = collection.getReverseIterator();
        while (reverseIterator.hasNext()){
            System.out.println(reverseIterator.next());
        }

        System.out.println("---------------------------------");

        Iterator reverseEveryThirdElementIterator = collection.getReverseEveryThirdElementIterator();
        while (reverseEveryThirdElementIterator.hasNext()){
            System.out.println(reverseEveryThirdElementIterator.next());
        }

        System.out.println("--------------Evgen's-------------------");

        collection.getFifthPairElement();

        System.out.println("--------------Evgen's-------------------");

        Iterator valEverySecondStaticPairsTransform = collection.getEverySecondStaticPairsTransform();
        while (valEverySecondStaticPairsTransform.hasNext()){
            System.out.println(valEverySecondStaticPairsTransform.next());
        }

    }
}
