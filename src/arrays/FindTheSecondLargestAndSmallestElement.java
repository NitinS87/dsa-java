package arrays;

public class FindTheSecondLargestAndSmallestElement {
    public static void main(String[] args) {
        System.out.println("Find the second largest and smallest element in an array");
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };

        int[] res = findSecondLargestAndSmallest(arr);

        System.out.println("\nThe second largest element is: " + res[0]);
        System.out.println("The second smallest element is: " + res[1]);
    }

    private static int[] findSecondLargestAndSmallest(int[] arr) {
        int[] res = new int[2];

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // if the current element is greater than the largest element, then update the
            // largest and second largest elements
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // if the current element is greater than the second largest element, then
            // update the second largest element
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

            // if the current element is smaller than the smallest element, then update the
            // smallest and second smallest elements
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // if the current element is smaller than the second smallest element, then
            // update the second smallest element
            else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        res[0] = secondLargest;
        res[1] = secondSmallest;

        return res;
    }
}
