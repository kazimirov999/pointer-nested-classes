public class Collection {
    private static Object[] objects;

    public Collection(Object[] objects) {
        this.objects = objects;
    }

    private class DirectZeroForOddIterator implements Iterator {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        @Override
        public Object next() {
            if (currentIndex % 2 != 0) {
                currentIndex++;
                return 0;
            } else {
                return objects[currentIndex++];
            }
        }
    }

    class ReverseThroughOneIterator implements Iterator {
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

    void getReversePrintEveryThirdOddIterator() {

        Iterator ReversePrintEveryThirdOddIterator = new Iterator() {

            private int currentIndex = objects.length - 3;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex -= 2;
                return (int) objects[index] % 2 == 0 ? objects[index] : null;
            }
        };

        while (ReversePrintEveryThirdOddIterator.hasNext()) {
            showWithoutNull(ReversePrintEveryThirdOddIterator.next());
        }
    }

    public void directEveryEvenFifthIteratorSubtractHundred() {
        class DirectEveryEvenFifthIteratorSubtractHundred implements Iterator {
            private int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < objects.length;
            }

            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex += 4;
                return (int) objects[index] % 2 == 0 ? (int) objects[index] - 100 : null;
            }
        }

        DirectEveryEvenFifthIteratorSubtractHundred directEveryEvenFifthIteratorSubtractHundred = new DirectEveryEvenFifthIteratorSubtractHundred();

        while (directEveryEvenFifthIteratorSubtractHundred.hasNext()) {
            showWithoutNull(directEveryEvenFifthIteratorSubtractHundred.next());
        }
    }

    static class DirectEverySecondToNotOdd implements Iterator {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        @Override
        public Object next() {
            int index = currentIndex;
            currentIndex++;
            return index % 2 != 0 ? objects[index] : (int) objects[index] % 2 == 0 ? (int) objects[index] - 1 : objects[index];
        }
    }

    public void showWithoutNull(Object object) {
        if (object != null) {
            System.out.println(object);
        }
    }

    Iterator getDirectZeroForOddIterator() {
        return new DirectZeroForOddIterator();
    }

    Iterator getReverseThroughOneIterator() {
        return new ReverseThroughOneIterator();
    }

    Iterator getDirectEverySecondToNotOdd() {
        return new DirectEverySecondToNotOdd();
    }
}
