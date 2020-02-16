public class BinTree {

    public BinNode root;

    public BinTree() {
        
    }

    public boolean insert(int value) {
        if(root == null) {
            root = new BinNode(value);
            return true;
        } else {
            BinNode current = root;
            BinNode previous = current;
            while(current != null) {
                if(value < current.element) {
                    previous = current;
                    current = current.left;
                }
                if(value == current.element) {
                    return false;
                }
                if(value > current.element) {
                    previous = current;
                    current = current.right;
                }
                if(current == null) {
                    if(value < previous.element) {
                        previous.left = new BinNode(value);
                    } else if(value > previous.element) {
                        previous.right = new BinNode(value);
                    }

                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        BinTree bTree = new BinTree();

        bTree.insert(5);
        bTree.insert(3);
        bTree.insert(2);
        bTree.insert(1);
        
    }
}