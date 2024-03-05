package arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println("Rotate an array");
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr = { -1, -100, 3, 99 };
        int k = 2;

        System.out.println("\nThe original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        rotateArray(arr, k);

        System.out.println("\nThe array after rotating " + k + " times is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        // length of the array
        int n = arr.length;

        // if the array is empty or has only one element
        if (n == 0 || n == 1) {
            return;
        }

        // if k is greater than the length of the array
        k = k % n;

        // reverse the first n - k elements
        reverse(arr, 0, n - k - 1);

        // reverse the last k elements
        reverse(arr, n - k, n - 1);

        // reverse the whole array
        reverse(arr, 0, n - 1);

    }

    private static void reverse(int[] arr, int start, int end) {
        // reverse an array
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
