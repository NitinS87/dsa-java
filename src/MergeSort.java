import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        mergeSort(arr);
        System.out.println("\nAfter sorting array: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void divide(int[] arr, int low, int high) {
        // base case
        // when low == high, we have a single element
        if (low >= high)
            return;

        // System.out.println("low: " + low + " high: " + high);
        int mid = (low + high) / 2;

        // divide the array into two halves
        divide(arr, low, mid);
        divide(arr, mid + 1, high);

        // merge the two halves
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;

        // compare the elements in the two halves and add the smaller one to the temp
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // add the remaining elements to the temp
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // copy the elements from the temp to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

}
