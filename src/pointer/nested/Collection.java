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

                if (o instanceof Number && ((Integer) o) % 2 == 1) {
                    return o;
                }
                return null;
            }
        };
    }

    public Iterator getDirectThroughFourElements() {
        class Local implements Iterator {
            private int index;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Object next() {
                if (!(array[index] instanceof Number)) {
                    index += 5;
                    return null;
                }

                int value = (int) array[index];
                index += 5;

                if (value % 2 == 0) {
                    return (value - 100);
                }

                return null;
            }
        }

        return new Local();
    }

    public Iterator getReverseOrderPairInterator(){
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
            if (index % 2 == 0){
                return array[index++];
            }

            index++;
            return  0;
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

    static class ReverseOddPair implements Iterator {

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
            if (!(collection.array[currentIndex] instanceof Number)){
                return null;
            }

            int value = (int) collection.array[currentIndex];

            if (value % 2 == 0){
                value++;
            }

            currentIndex += 2;
            return  value;
        }
    }
}
