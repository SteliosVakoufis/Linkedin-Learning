import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Algorithms {

    public static List<Integer> findMissingElements(int[] arrA, int[] arrB) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int val : arrA) {
            if (!set.contains(val))
                set.add(val);
        }

        for (int val : arrB) {
            if (!set.contains(val))
                result.add(val);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] myArrA = {8, 0, 1, 7, 3};
        int[] myArrB = {5, 7, 8, 0, 2};

        List<Integer> myList = findMissingElements(myArrA, myArrB);
        myList.forEach(val -> System.out.printf("%d ", val));

    }
}
