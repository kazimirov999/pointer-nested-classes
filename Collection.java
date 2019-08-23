import static java.lang.System.out;

class Collection {
    private final Object[] objects;

    Collection(Object[] objects) {
        this.objects = objects;
    }

    Iterator getDirectZeroIterator() {
        return new DirectZeroIterator();
    }

    Iterator getReverseIterator() {
        return new ReverseIterator();
    }


    Iterator getEverySecondStaticPairsTransform() {
        return new EverySecondStaticPairsTransform();
    }

    Iterator getReverseEveryThirdElementIterator() {
        return new Iterator() {

            private int currentIndex = objects.length - 1;

            @Override
            public boolean hasNext() {
                return currentIndex > 0;
            }


            @Override
            public Object next() {
                int index = currentIndex;
                currentIndex -= 3;
                return (int) objects[index] % 2 != 0 ? objects[index] : null;
            }
        };
    }

    void getFifthPairElement() {
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
            out.println(varFifthPairElementIterator.next());
        }
    }

    public static class EverySecondStaticPairsTransform implements Iterator {

        Object[] objects = new Object[]{10, 20, 30, 40, 50, 60, 70};

        private int currentIndex = 1;


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

    private class DirectZeroIterator implements Iterator {

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

    private class ReverseIterator implements Iterator {

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


}
