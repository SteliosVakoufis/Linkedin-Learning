import java.util.LinkedList;
import java.util.Queue;

public class Algorithms {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);
        queue.add(0);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        while (queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
