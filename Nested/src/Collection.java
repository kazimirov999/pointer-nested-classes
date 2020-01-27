public class Collection {
    public static Integer[] array;

    public Collection(Integer[] args) {
        this.array = args;
    }
    class FirstTaskIterator implements Iterator {

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

    class SecondTaskIterator implements Iterator {

        private int count = array.length - 1;

        @Override
        public boolean hesNext() {
            return count > 0;
        }

        @Override
        public Integer next() {
            int a;
            a = array[count];
            count -= 2;
            return a;
        }

    }

    class ThirdTaskIterator implements Iterator {

        private int count = 0;


        @Override
        public boolean hesNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            int a = 0;
            while (a == 0 && count < array.length) {
                if ((count + 1) % 5 == 0 && array[count] % 2 == 0) {
                    a = array[count] - 100;
                }
                count++;
            }
            return a;
        }
    }

    static class FourthTaskIterator implements Iterator {

        private int count;

        @Override
        public boolean hesNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            int a = 0;
            while (a == 0 && a < array.length) {
                if (array[count] % 2 == 0) {
                    a = array[count] - 1;
                }
                count ++;
            }
            return a;
        }

    }

}

