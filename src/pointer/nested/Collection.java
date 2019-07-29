package pointer.nested;

public class Collection implements Iterator {
    private Object[] array;
    private int index;

    public Collection(Object... array) {
        this.array = array;
    }

    public Object getObject(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void showArray(Iterator iterator) {

        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object != null) {
                System.out.println("The next element is: " + object);
            }
        }
    }

    public void showArray() {
        showArray(this);
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        return array[index++];
    }

    class DirectDisplayWithZeroOdds implements Iterator {
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

    class ReverseDisplay implements Iterator {
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

        private Collection collection;

        public ReverseOddPair(Collection collection) {
            this.collection = collection;
            this.collection.index = 0;
        }

        @Override
        public boolean hasNext() {
            return collection.hasNext();
        }

        @Override
        public Object next() {
            if (!(collection.getObject(collection.index) instanceof Number)){
                return null;
            }

            int value = (int) collection.array[collection.index];

            if (value % 2 == 0){
                value++;
            }

            collection.index += 2;
            return  value;
        }
    }
}
