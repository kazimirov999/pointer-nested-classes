public class Main {

    public static void main(String[] args) {

        Collection collection = new Collection(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});

        Iterator iterator = collection.initDirectIterator();

        display(iterator);
        display(collection.twinIterator());
        display(collection.backIterator());
        display(collection.backThirdElement());
        display(collection.fifeElement());
        display(collection.minOne());

    }


    static void display(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
