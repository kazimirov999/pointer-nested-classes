package pointer.nested;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection(1,1,3,5,8,12,21,34,55,89);

        display("Initial array:", collection, collection);
        display("Direct display with zero odds:", collection, collection.new DirectDisplayWithZeroOdds());
        display("Reverse display (values through one):", collection, collection.new ReverseDisplay());

        Iterator iterator = new Iterator() {
            private int index = collection.size() - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Object next() {
                Object o = collection.getObject(index);
                index -= 3;

                if (o instanceof Number && ((Integer) o) % 2 == 1) {
                    return o;
                }
                return null;
            }
        };

        display("Reverse display odd values through two:", collection, iterator);

        class Local implements Iterator {
            private int index;

            @Override
            public boolean hasNext() {
                return index < collection.size();
            }

            @Override
            public Object next() {
                if (!(collection.getObject(index) instanceof Number)){
                    index +=5;
                    return null;
                }

                int value = (int) collection.getObject(index);
                index +=5;

                if (value % 2 == 0){
                    return (value - 100);
                }

                return null;
            }
        }

        display("Direct display pair values through five:", collection, new Local());

        display("Direct display all odd values on pair indexes. If a value is a pair one - change to odd.",
                collection, new Collection.ReverseOddPair(collection));
    }

    private static void display(String message, Collection collection, Iterator iterator) {
        System.out.println(message);
        collection.showArray(iterator);
    }
}