import java.util.Stack;

public class Algorithms {

    public static void main(String[] args) {
        int[] myNums = {16, 7, 2, 15};

        findNextElement(myNums);

    }

    private static void findNextElement(int[] nums) {
        if (nums.length == 0) return;

        Stack<Integer> stack = new Stack<>();

        for (int val : nums) {
            if (stack.empty())
                stack.add(val);
            while (stack.peek() < val) {
                System.out.printf("%d -> %d\n", stack.pop(), val);
            }
            if (stack.peek() > val) {
                stack.push(val);
            }
        }

        while (!stack.empty()) {
            System.out.printf("%d -> -1\n", stack.pop());
        }

    }

}
