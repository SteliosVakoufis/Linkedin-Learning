import java.util.Arrays;

public class Algorithms {

    public static void rotateArrayLeftOLD(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempInt = arr[i];
            arr[i] = arr[(i == arr.length - 1 ? 0 : i + 1)];
            arr[(i == arr.length - 1 ? 0 : i + 1)] = tempInt;
        }
    }

    public static void rotateArrayLeft(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempInt = arr[i];
            // System.out.println(tempInt);s

            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();

            arr[i] = arr[i - 1];
            
            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();
            
            arr[i - 1] = tempInt;
            
            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();
        }
    }

    public static void rotateArrayRight(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            int tempInt = arr[i];
            // System.out.println(tempInt);s

            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();

            arr[i] = arr[i + 1];
            
            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();
            
            arr[i + 1] = tempInt;
            
            // Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 3, 4, 5, 6 };
        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
        System.out.println();

        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
        System.out.println();
        System.out.println();

        rotateArrayRight(arr);
        System.out.println();
        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
        System.out.println();

        rotateArrayRight(arr);
        System.out.println();
        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
        System.out.println();
    }
}
