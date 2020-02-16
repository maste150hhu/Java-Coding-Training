public class StringList {
    
    public StringNode head;

    // default constructor
    public StringList() {}

    // constructor with head
    public StringList(StringNode head) {
        this.head = head;
    }

    public void insert(String value) {
        if(head == null) {
            head = new StringNode(value);
        } else {
            StringNode current = head;

            while(current.next != null) {
                current = current.next;
            }
            current.next = new StringNode(value);
        }
    }

    // print method
    public void print() {
        if(head != null) {
            StringNode current = head;
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
            StringNode current = head;
            int result = 0;

            while(current != null) {
                result++;
                current = current.next;
            }

            return result;
        }
    }

    public boolean isEquals(StringList comparedList) {
        if(comparedList.size() != this.size()) {
            return false;
        } else if(comparedList.head == null || this.head == null) {
            return false;
        } else {
            StringNode current1 = this.head;
            StringNode current2 = comparedList.head;

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

    public boolean findCloseNodes(String searchString) {
        if(head == null) {
            return false;
        } else {
            StringNode current = head;

            while(current != null) {
                if(current.element.contains(searchString)) {
                    System.out.println(current.element);
                }
                current = current.next;
            }

            return true;
        }
    }
    public static void main(String[] args) {
        StringList list = new StringList();
        list.insert("m2389@gmail.com"); 
        list.insert("m2389@web.de"); 
        list.insert("m2389@t-online.de"); 
        list.insert("m2389@hhu.de"); 
        
        list.findCloseNodes("hhu");
    }
}