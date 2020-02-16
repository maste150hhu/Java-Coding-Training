public class Node {

    public int element;
    public Node next;

    public Node(int el) {
        element = el;
    }

    public Node(int el, Node nx) {
        element = el;
        next = nx;
    }
}
