package src;

public class Collection {

    private Integer[] integers;

    public Collection(Integer[] integers) {
        this.integers = integers;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public static class FirstIteratorImplementator implements Iterator {
        private Integer[] integers;

        public FirstIteratorImplementator(Integer[] integers) {
            this.integers = integers;
        }

        public Integer[] getIntegers() {
            return integers;
        }


        @Override
        public boolean hasNext() {
            for (int i = 0; i < integers.length; i++) {
                System.out.println(integers[i]);
            }
            return false;
        }


        @Override
        public Object next() {
            for (int i = 0; i < integers.length; i++) {
                if (i % 2 != 0) {
                    integers[i] = null;
                }
                System.out.println(integers[i]);
            }
            return integers;
        }
    }

    public static class secondIteratorImplementator implements Iterator {
        private Integer[] integers;

        public secondIteratorImplementator(Integer[] integers) {
            this.integers = integers;
        }


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            for (int i = 0; i < integers.length; i += 2) {
                System.out.println(integers[i]);
            }
            return integers;
        }
    }
}
