public class Algorithms {

    public static boolean binarySearch(int[] arr, int item) {
        for (int i = arr.length / 2; i < arr.length && arr.length >= 0;) {
            if (arr[i] == item) return true;
            if (arr[i] > item) i--; else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 15));
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 8));
    }
}
