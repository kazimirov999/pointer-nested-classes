package src;

public class Main {

    public static void main(String[] args) {

        Collection collection = new Collection(new Integer[]{10, 11, 12,13,14,15});


        Iterator iterator = collection.directIterator();
        Iterator iterator2 = collection.directIterator();
        display(iterator);
        display(iterator2);

    }


    static void display(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
