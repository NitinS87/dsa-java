package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Find the missing number in an array");
        int[] arr = { 3, 0, 1 };

        int missingNumber = findMissingNumber(arr);
        int missingNumber2 = mySolution(arr);

        System.out.println("\nThe missing number in the array is: " + missingNumber + " " + missingNumber2);
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum -= arr[i];
        }

        return sum;
    }

    private static int mySolution(int[] arr) {
        int orgSum = 0;
        int givenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            orgSum += i;
            givenSum += arr[i];
        }

        orgSum += arr.length;
        // System.out.println(givenSum + " " + orgSum);
        return orgSum - givenSum;
    }

}
