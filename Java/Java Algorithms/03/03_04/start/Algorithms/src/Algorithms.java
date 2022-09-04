public class Algorithms {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        linkedList.addNode(new Node(3));
        linkedList.addNode(new Node(4));
        linkedList.addNode(new Node(5));
        linkedList.addNode(new Node(6));
        linkedList.addNode(new Node(1));
        linkedList.addNode(new Node(6));
        linkedList.addNode(new Node(1));
        linkedList.addNode(new Node(14));

        linkedList.displayContents();
        System.out.println(linkedList.size);
        linkedList.deleteFromBackAt(6);

        linkedList.displayContents();
        
        // linkedList.deleteBackHalf();
        
        // linkedList.displayContents();

    }
}
