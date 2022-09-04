public class Algorithms {

    public static void main(String[] args) {
        Node rootnNode = new Node();
        rootnNode.data = 2;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootnNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);

    }
}
