public class BinNode {

    public int element;
    public BinNode left, right;

    public BinNode(int e, BinNode l, BinNode r) {
        element = e;
        left = l;
        right = r;
    }

    public BinNode(int e) {
        element = e;
    }
}