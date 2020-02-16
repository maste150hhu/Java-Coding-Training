public class LinkedList {
    
    public Node head;

    // default constructor
    public LinkedList() {}

    // constructor with head
    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert(int value) {
        if(head == null) {
            head = new Node(value);
        } else {
            Node current = head;

            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

    // print method
    public void print() {
        if(head != null) {
            Node current = head;
            while(current != null) {
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public int size() {
        if(head == null) {
            return 0;
        } else {
            Node current = head;
            int result = 0;

            while(current != null) {
                result++;
                current = current.next;
            }

            return result;
        }
    }

    public boolean isEquals(LinkedList comparedList) {
        if(comparedList.size() != this.size()) {
            return false;
        } else if(comparedList.head == null || this.head == null) {
            return false;
        } else {
            Node current1 = this.head;
            Node current2 = comparedList.head;

            int compareCounter = 0;
            while((current1 != null && current2 != null) && (current1.element == current2.element)) {
                compareCounter++;
                current1 = current1.next;
                current2 = current2.next;
            }

            if(compareCounter == this.size()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(1);
        list.insert(2);
        list.insert(3); 
        
        LinkedList anotherList = new LinkedList();
        anotherList.insert(5);
        anotherList.insert(1);
        anotherList.insert(2);
        anotherList.insert(3);

        System.out.println(list.isEquals(anotherList));
    }
}