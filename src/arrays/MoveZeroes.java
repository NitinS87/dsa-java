package arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println("Move zeroes to the end of the array");
        int[] arr = { 0, 1, 0, 3, 12 };

        System.out.println("\nThe original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        moveZeroes(arr);

        System.out.println("\nThe array after moving zeroes to the end is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveZeroes(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }
}
