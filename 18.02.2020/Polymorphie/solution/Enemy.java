public class Enemy implements GameObject {

    public long id;
    public int x, y;
    public final char texture = 'E';

    public Enemy(long id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    //remove
    public long getId() {
        return id;
    }

    //remove
    public void print() {
        System.out.print(texture);
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