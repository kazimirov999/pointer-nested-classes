package src;

public class IteratorForEveryFifthElement {
    private Integer[] integers;

    public IteratorForEveryFifthElement(Integer[] integers) {
        this.integers = integers;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public void iterateEveryFifthElemant(Integer[] inputtedIntegers) {
        for (int i = 0; i < inputtedIntegers.length; i += 5) {
            if (inputtedIntegers[i] % 2 == 0) {
                inputtedIntegers[i] -= 100;
                System.out.println(inputtedIntegers[i]);
            }
        }
    }

    public static class InsideIterator {
        public static void changeNumberIfItOdd(Integer[] inputtedIntegers) {
            for (int i = 0; i < inputtedIntegers.length; i += 2) {
                if (inputtedIntegers[i] % 2 == 0) {
                    inputtedIntegers[i] += 1;
                    System.out.println(inputtedIntegers[i]);
                }
            }

        }
    }
}
