public class Book {

    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + ", " + author;
    }
}