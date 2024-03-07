package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("Find the single number in an array");
        int[] arr = { 4, 1, 2, 1, 2 };

        int singleNumber = findSingleNumber(arr);
        int singleNumber2 = hashTableSolution(arr);

        System.out.println("\nThe single number in the array is: " + singleNumber + " " + singleNumber2);
    }

    private static int findSingleNumber(int[] arr) {
        int singleNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            singleNumber ^= arr[i];
        }

        return singleNumber;
    }

    private static int hashTableSolution(int[] arr) {
        int singleNumber = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // traverse the array and check the count of each element
        // for (int i = 0; i < arr.length; i++) {
        //     if (map.get(arr[i]) == 1) {
        //         singleNumber = arr[i];
        //         break;
        //     }
        // }

        // or traverse the map and get the key with value 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                singleNumber = entry.getKey();
                break;
            }
        }

        return singleNumber;
    }
}
