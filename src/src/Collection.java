import java.util.ArrayList;

public class Collection {
    private final Integer[] integers;


    Collection(Integer[] integers) {
        this.integers = integers;
    }
    public Iterator initDirectIterator(){
        return new Iterator() {
            int index;

            @Override
            public boolean hasNext() {
                return index < integers.length;
            }

            @Override
            public Integer next() {
                return integers[index++];
            }
        };
    }
    public TwinIterator twinIterator(){
        return new TwinIterator();
    }


    private class TwinIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < integers.length;
        }

        @Override
        public Integer next() {
            return index++ % 2 == 0 ? integers[index] : 0;
        }
    }


    public BackIterator backIterator() {
        return new BackIterator();
    }
    private class BackIterator implements Iterator{

        int index = integers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            Integer i = integers[index];
            index -= 2;
            return i;
        }
    }


    public Iterator backThirdElement(){
        return new Iterator() {

            int index = integers.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                Integer i = integers[index];
                index -= 3;
                return i % 2 == 1 ? i : 0;
            }
        };
    }


    public Iterator fifeElement(){
        class Local implements Iterator{
            int index;

            @Override
            public boolean hasNext() {
                return index < integers.length;
            }

            @Override
            public Integer next() {
                int value = integers[index];
                index += 5;
                return value % 2 == 0 ? value - 100 : 0;
            }
        }
        return new Local();
    }


    public Statical minOne(){
        return new Statical();
    }

    public static class Statical implements Iterator{

        Integer[] integers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int index;

        @Override
        public boolean hasNext() {
            return index < integers.length;
        }

        @Override
        public Integer next() {
            return index++ % 2 == 0 ? integers[index] - 1 : 0;
        }
    }
}
