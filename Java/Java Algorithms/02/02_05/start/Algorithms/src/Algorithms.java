import java.util.Arrays;

public class Algorithms {

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }

    public static void reverseInPlace(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int tempInt = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tempInt;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        Arrays.stream(reverse(arr))
                .forEach(System.out::println)
        ;
        
        System.out.println();
        reverseInPlace(arr);
        reverseInPlace(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
