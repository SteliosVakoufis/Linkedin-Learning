public class CustomLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node prevNode = null;
            Node lastNode = head;
    
            while (lastNode != null){
                prevNode = lastNode;
                lastNode = lastNode.next;
            }

            newNode.prev = prevNode;
            prevNode.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void deleteFromBackAt(int n){
        if (n < size){
            int count = 0;
    
            Node currentNode = tail;
    
            while(count < n){
                count++;
                currentNode = currentNode.prev;
            }
    
            Node tempNode = currentNode.next.next;
            currentNode.next = null;
            currentNode.next = tempNode;
            size--;
        }
    }

    // public void deleteBackHalf(){
        
    //     if (head == null || head.next == null) head = null;
        
    //     Node slow = head;
    //     Node fast = head;
    //     Node prev = null;

    //     while (fast != null && fast.next != null) {
    //         fast = fast.next.next;
    //         prev = slow;
    //         slow = slow.next;
    //     }

    //     prev.next = null;
    // }
}
