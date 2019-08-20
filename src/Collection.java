public class Collection {
    private final Object[] objects;

    Collection(Object[] objects) {
        this.objects = objects;
    }

    public Iterator getDirectZeroInsteadOfOddIterator() {
        return new DirectZeroInsteadOfOddEIterator();
    }

    public Iterator getReverseThroughOneElementIterator() {
        return new ReverseThroughOneElementIterator();
    }

    public Iterator getDirectEverySecondEvenMakingOddIterator() {
        return new DirectEverySecondEvenMakingOddIterator();
    }

    public Iterator getReverseEveryThirdOddIterator() {
        return new Iterator() {
            private int currentIndex = objects.length - 3;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex -= 3;
                return (int) objects[index] % 2 != 0 ? objects[index] : null;
            }
        };
    }

    public class DirectZeroInsteadOfOddEIterator implements Iterator {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        @Override
        public Object next() {
            if ((int) objects[currentIndex] % 2 != 0) {
                currentIndex++;
                return 0;
            } else {
                return objects[currentIndex++];
            }
        }
    }

    public class ReverseThroughOneElementIterator implements Iterator {
        private int currentIndex = objects.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            int index = currentIndex;
            currentIndex -= 2;
            return objects[index];
        }
    }

    public static class DirectEverySecondEvenMakingOddIterator implements Iterator {

        Object[] objects = new Object[]{1210, 75, 1153, 1010, 1046, 1053, 263, 396, 768, 708, 1048};
        private int currentIndex = 1;

        @Override
        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        @Override
        public Object next() {
            int index = currentIndex;
            currentIndex += 2;
            if ((int) objects[index] % 2 == 0) {
                return (int) objects[index] - 1;
            } else {
                return null;
            }
        }
    }

    public void localEveryEvenFifthSubtractOneHundred() {
        class LocalEveryEvenFifthElement implements Iterator {
            private int currentIndex = 4;

            @Override
            public boolean hasNext() {
                return currentIndex < objects.length;
            }

            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex += 5;
                return (int) objects[index] % 2 == 0 ? (int) objects[index] - 100 : null;
            }
        }
        LocalEveryEvenFifthElement localEveryEvenFifthElement = new LocalEveryEvenFifthElement();
        while (localEveryEvenFifthElement.hasNext()) {
            Object showWithoutNull = localEveryEvenFifthElement.next();
            if (showWithoutNull != null) {
                System.out.println(showWithoutNull);
            }
        }
        System.out.println(".......................................");
    }

    public void showWithoutNull(Iterator iterator) {
        while (iterator.hasNext()) {
            Object temp = iterator.next();
            if (temp != null) {
                System.out.println(temp);
            }
        }
        System.out.println(".......................................");
    }
}
