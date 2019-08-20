public class Main {

    public static void main(String[] args) {
        Object[] objects = new Object[]{1210, 75, 1153, 1010, 1046, 1053, 263, 396, 768, 708, 1048};
        Collection collection = new Collection(objects);
        collection.showWithoutNull(collection.getDirectZeroInsteadOfOddIterator());
        collection.showWithoutNull(collection.getReverseThroughOneElementIterator());
        collection.showWithoutNull(collection.getReverseEveryThirdOddIterator());
        collection.localEveryEvenFifthSubtractOneHundred();
        collection.showWithoutNull(collection.getDirectEverySecondEvenMakingOddIterator());
    }
}

