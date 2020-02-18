public class eBook extends Book {

    public int filesize;

    public eBook(String t, String a, int f) {
        super(t, a);
        filesize = f;
    }

    public String toString() {
        return super.toString() + ", " + filesize;
    }
}