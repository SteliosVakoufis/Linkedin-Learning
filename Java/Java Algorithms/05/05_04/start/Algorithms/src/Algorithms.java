import java.util.HashMap;

public class Algorithms {

    public static void displayFreqOfEachElement(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int val : arr) {
            if (!hashMap.containsKey(val))
                hashMap.put(val, 1);
            else
                hashMap.put(val, hashMap.get(val) + 1);
        }

        hashMap.forEach((key, val) -> System.out.printf("%d -> %d\n", key, val));
    }

    public static void main(String[] args) {
        displayFreqOfEachElement(new int[] {10, 3, 10, 20, 3, 3, 3});
    }
}
