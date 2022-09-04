public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            Node node = new Node();
            node.data = value;
            root = node;
        } else {
            if (root.data > value) {
                root.left = insert(root.left, value);
            }
            if (root.data < value) {
                root.right = insert(root.right, value);
            }
        }

        return root;
    }

}
