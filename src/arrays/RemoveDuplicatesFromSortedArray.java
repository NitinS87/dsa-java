package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Remove duplicates from a sorted array");
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9, 9, 9, 10, 10 };

        int n = removeDuplicates(arr);

        System.out.println("\nThe length of the array after removing duplicates is: " + n);
        System.out.println("The array after removing duplicates is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        // length of the array
        int n = arr.length;

        // if the array is empty or has only one element
        if (n == 0 || n == 1) {
            return n;
        }

        // variable to store the index of the next unique element
        int j = 0;

        // loop through the array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // add the last element
        arr[j++] = arr[n - 1];

        // return the length of the array after removing duplicates
        return j;
    }

}
