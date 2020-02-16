public class Obstacle implements GameObject {

    public int x,y;
    public long id;
    public final char texture = '#';

    public Obstacle(long id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.print(texture);
    }

    public long getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}