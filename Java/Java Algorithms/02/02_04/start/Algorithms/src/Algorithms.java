import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Algorithms {

    public static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int val : arr1) {
            if (val % 2 == 0) result.add(val);
        }

        for (int val : arr2) {
            if (val % 2 == 0) result.add(val);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findEvenNums2(int[] arr1, int[] arr2){
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };

        Arrays.stream(findEvenNums(arr1, arr2))
        .forEach(System.out::println);

        Arrays.stream(findEvenNums2(arr1, arr2))
        .forEach(System.out::println);
        

    }
}
