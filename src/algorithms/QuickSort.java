package algorithms;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Quick Sort");
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };

        System.out.println("Before sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(arr);

        System.out.println("\nAfter sorting array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void divide(int[] arr, int low, int high) {
        // base case
        // when low == high, we have a single element
        if (low >= high)
            return;

        // find the pivot index
        int pivot = partition(arr, low, high);

        // divide the array into two halves
        divide(arr, low, pivot - 1);
        divide(arr, pivot + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        // choose the first element as the pivot
        int pivot = arr[low];

        // i is the index of the last element in the left partition
        int i = low;
        // j is the index of the first element in the right partition
        int j = high;

        while (i < j) {
            // move i to the right until we find an element greater than the pivot
            while (i < high && arr[i] <= pivot)
                i++;

            // move j to the left until we find an element less than the pivot
            while (j > low && arr[j] > pivot)
                j--;

            // swap the elements at i and j
            if (i < j)
                swap(arr, i, j);
        }

        // swap the pivot with the element at j
        swap(arr, low, j);

        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
