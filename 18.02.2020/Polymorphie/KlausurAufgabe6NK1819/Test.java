/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Book[] buecher = new Book[1];

        buecher[0] = new eBook("Schöttners süße Desserts 2", "Michael Schöttner", 370);
        System.out.println(buecher[0].toString());
    }
}