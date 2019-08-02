public class Main {

    public static void main(String[] args) {
        Object[] objects = new Object[]{100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100};
        Collection collection = new Collection(objects);
        Iterator zeroInsteadOfOdd = collection.getDirectZeroInsteadOfOddIterator();
        collection.showWithoutNull(zeroInsteadOfOdd);
        Iterator reverseThroughOne = collection.getReverseThroughOneElementIterator();
        collection.showWithoutNull(reverseThroughOne);
        Iterator reverseEveryThirdOddElement = collection.getReverseEveryThirdOddIterator();
        collection.showWithoutNull(reverseEveryThirdOddElement);
        collection.localEveryEvenFifthSubtractOneHundred();
        Iterator directEverySecondEvenMakingOdd = collection.getDirectEverySecondEvenMakingOddIterator();
        collection.showWithoutNull(directEverySecondEvenMakingOdd);
    }
}

