package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Find the maximum number of consecutive 1s in an array");
        int[] arr = { 1, 1, 0, 1, 1, 1 };

        int maxConsecutiveOnes = findMaxConsecutiveOnes(arr);

        System.out.println("\nThe maximum number of consecutive 1s in the array is: " + maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}
