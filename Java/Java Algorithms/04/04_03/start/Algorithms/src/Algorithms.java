import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Algorithms {

    public static void main(String[] args) {
        ArrayList<Integer> myBinaryNumbers = generateBinaryNumbers(9);
        myBinaryNumbers.forEach(val -> System.out.printf("%d ", val));
        
    }

    private static ArrayList<Integer> generateBinaryNumbers(int range){
        Queue<Integer> binaryNumbers = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        binaryNumbers.add(1);
        for (int i = 0; i < range; i++) {
            int current = binaryNumbers.remove();
            result.add(current);

            binaryNumbers.add(current * 10);
            binaryNumbers.add(current * 10 + 1);
        }

        return result;
    }
}
