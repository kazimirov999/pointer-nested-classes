public class Main {
    public static void main(String[] args) {
        Collections collections = new Collections(new Integer[]{10, 11, 12, 13, 14, 15, 16, 17});

        Iterator iterator = new collections.directIterator();
        display(iterator);
    }


    static void display(Iterator iterator) {
        while (Iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

