public class StringNode {

    public String element;
    public StringNode next;

    public StringNode(String el) {
        element = el;
    }

    public StringNode(String el, StringNode nx) {
        element = el;
        next = nx;
    }
}
