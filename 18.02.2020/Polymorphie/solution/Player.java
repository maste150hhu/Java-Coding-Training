public class Player implements GameObject {

    public long id;
    public int x;
    public int y;
    public final char texture = 'X';

    public Player(long id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    //remove
    public void print() {
        System.out.print(texture);
    }

    //remove
    public long getId() {
        return id;
    }

    //remove
    public int getX() {
        return x;
    }

    //remove
    public int getY() {
        return y;
    }

    //remove
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}