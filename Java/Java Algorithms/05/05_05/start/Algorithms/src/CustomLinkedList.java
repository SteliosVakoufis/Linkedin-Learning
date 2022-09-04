import java.util.HashMap;
import java.util.HashSet;

public class CustomLinkedList {

    Node head;

    public boolean hasCycle() {
        HashSet<Node> set = new HashSet<>();

        Node current = head;
        while (current.next != null) {
            if (set.contains(current))
                return true;
            set.add(current);
            current = current.next;
        }

        return false;
    }
}
