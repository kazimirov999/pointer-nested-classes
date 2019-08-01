package pointer.nested;

public class Collection {
    private final Object[] array;

    public Collection(Object... array) {
        this.array = array;
    }

    public Iterator getDirectIterator(){
        return new Iterator() {
            int index;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Object next() {
                return array[index++];
            }
        };
    }

    public Iterator getDirectWithZeroOddsIterator() {
        return new DirectIteratorWithZeroOdds();
    }

    public Iterator getReverseByPairIndexIterator() {
        return new ReverseIteratorByPairIndex();
    }

    public Iterator getReverseThroughTwoElementsIterator() {
        return new Iterator() {
            private int index = array.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Object next() {
                Object o = array[index];
                index -= 3;

                return (((int) o) % 2 == 1) ? o : null;
            }
        };
    }

    public Iterator getDirectThroughFourElementsIterator() {
        class Local implements Iterator {
            private int index;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Object next() {
                int value = (int) array[index];
                index += 5;
                return value % 2 == 0 ? value - 100 : null;
            }
        }

        return new Local();
    }

    public Iterator getReverseOrderPairIterator(){
        return new ReverseOddPair(this);
    }

    private class DirectIteratorWithZeroOdds implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            return index++ % 2 == 0 ? array[index - 1] : 0;

        }
    }

    private class ReverseIteratorByPairIndex implements Iterator {
        private int index = array.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            Object o = array[index];
            index -= 2;
            return o;
        }
    }

    class ReverseOddPair implements Iterator {

        private final Collection collection;
        private int currentIndex = 0;

        public ReverseOddPair(Collection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < collection.array.length;
        }

        @Override
        public Object next() {
            Integer value = (int) collection.array[currentIndex];
            currentIndex += 2;
            return value % 2 == 0 ? ++value : value;
        }
    }
}