package pointer.nested;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection(	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
                1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
                1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155);

        display("Initial array:", collection.getDirectIterator());

        display("Direct display with zero odds:", collection.getDirectWithZeroOddsIterator());

        display("Reverse display (values through one):", collection.getReverseByPairIndexIterator());

        display("Reverse display odd values through two:", collection.getReverseThroughTwoElementsIterator());

        display("Direct display pair values through five:", collection.getDirectThroughFourElements());

        display("Direct display all odd values on pair indexes. If a value is a pair one - change to odd.",
                collection.getReverseOrderPairInterator());
    }

    private static void display(String message, Iterator iterator) {
        System.out.println(message);

        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object != null) {
                System.out.println("The next element is: " + object);
            }
        }
        System.out.println("-----------------------");
    }
}