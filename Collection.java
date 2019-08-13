package com.encoding;

public class Collection {

    private final Object[] objects;

    public Collection(Object[] objects) {
        this.objects = objects;
    }

    public Iterator getDirectIterator() {
        return new DirectIterator();
    }

    public Iterator getReverseIterator() {
        return new ReverseIterator();
    }



    public Iterator getEverySecondStaticPairsTransform() {
        return new EverySecondStaticPairsTransform();
    }

    public Iterator getReverseEveryThirdElementIterator() {
        return new Iterator() {

            private int currentIndex = objects.length - 3;

            @Override
            public boolean hasNext() {
                return currentIndex > 0 && currentIndex % 2 != 0;
            }

            // 0, 1, 2, 3, 4, 5
            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex -= 2;
                return objects[index];
            }
        };
    }

    private class DirectIterator implements Iterator {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < objects.length;
        }

        @Override
        public Object next() {
            return objects[currentIndex++];
        }
    }

    private class ReverseIterator implements Iterator {

        private int currentIndex = objects.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            return objects[currentIndex--];
        }
    }

    public void getFifthPairElement() {
        class FifthPairElement implements Iterator {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < objects.length;
            }

            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex += 5;
                if (currentIndex % 2 != 0)
                    return objects[index];
                return (int) objects[index] - 100;
            }
        }
        FifthPairElement varFifthPairElementIterator = new FifthPairElement();
        while (varFifthPairElementIterator.hasNext()) {
            System.out.println(varFifthPairElementIterator.next());
        }
    }

    public static class EverySecondStaticPairsTransform implements Iterator{

        Object[] objects = new Object[]{100, 200, 300, 400, 500, 600, 700, 800};

        private int currentIndex = 0;
        private int index = 0;

        @Override
        public boolean hasNext(){
            return currentIndex < objects.length;
        };

        @Override
        public Object next(){
            index = currentIndex;
            currentIndex ++;
            if ((currentIndex-1) % 2 == 0 && currentIndex <= objects.length)
                return objects[index+1];
            return null;
        };
    }

}
