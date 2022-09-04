public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public boolean retrieve(int value) {
        return retrieve(this.root, value) == -1 ? false : true;
    }

    private int retrieve(Node root, int value) {
        if (root != null) {
            if (root.data == value) {
                return root.data;
            }
            if (root.data > value) {
                return retrieve(root.left, value);
            }
            if (root.data < value) {
                return retrieve(root.right, value);
            }
        }

        return -1;
    }
}
