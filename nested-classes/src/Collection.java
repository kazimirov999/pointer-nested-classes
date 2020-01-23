public class Collection {

    public static Integer[] array;

    public Collection(Integer[] args) {
        this.array = args;
    }

    class AscendingOrderIterator implements Iterator {

        private int count = 0;

        @Override
        public boolean hesNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            if ((count % 2) == 0) {
                return array[count++];
            }
            count++;
            return 0;
        }
    }

    class DescendingOrderIterator implements Iterator {

        private int count = array.length - 1;

        @Override
        public boolean hesNext() {
            return count > 0;
        }

        @Override
        public Integer next() {
            if ((array.length - 1 % 2) == 0) {
                if ((count % 2) == 0) {
                    return array[count--];
                }
            } else if ((array.length - 1 % 2) != 0) {
                if ((count % 2) != 0) {
                    return array[count--];
                }
            }
            count--;
            return null;
        }
    }

    class LocalIterator implements Iterator {

        private int count = 0;

        @Override
        public boolean hesNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            if ((count % 5) == 0) {
                if (array[count] % 2 == 0) {
                    return array[count++] - 100;
                }
            }
            count++;
            return null;
        }
    }

    static class StaticIterator implements Iterator {

        private int count;

        @Override
        public boolean hesNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            if ((count % 2) != 0 && array[count] % 2 == 0) {
                array[count] = array[count] - 1;
                return array[count++];
            }
            count++;
            return null;
        }

    }
}
