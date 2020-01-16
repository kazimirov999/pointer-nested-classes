public class Collections {
    private static Integer[] integers;

    public Collections(Integer[] integers){
        Collections.integers = integers;

    }
    public firstToLastIterator directIterator() {
        return new firstToLastIterator();
    }

    private static class firstToLastIterator implements Iterator {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < integers.length;
        }

        @Override
        public Object next() {
            if (currentIndex % 2 != 0) {
                currentIndex++;
                return 0;
            } else {
                return integers[currentIndex++];
            }
            System.out.println(Integer[] integers);
        }
    }

        class lastToFirstIterator implements Iterator {
        private int currentIndex = integers.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            int index = currentIndex;
            currentIndex -= 2;
            return integers[index];
        }
    }


}
