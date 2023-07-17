package hw_week_4;

import java.util.Arrays;

//functions
public class problem1 {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static void removeMiddleElement(int[] arr) {
        if (arr.length % 2 == 0) {
            int[] temp = new int[arr.length - 2];
            int middleIndex = arr.length / 2;
            for (int i = 0; i < middleIndex - 1; i++) {
                temp[i] = arr[i];
            }
            for (int i = middleIndex + 1; i < arr.length; i++) {
                temp[i - 2] = arr[i];
            }
            arr = temp;
        } else {
            int[] temp = new int[arr.length - 1];
            int middleIndex = arr.length / 2;
            for (int i = 0; i < middleIndex; i++) {
                temp[i] = arr[i];
            }
            for (int i = middleIndex + 1; i < arr.length; i++) {
                temp[i - 1] = arr[i];
            }
            arr = temp;
        }
    }

    public static boolean adjDup(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        // Swap first and last elements
        swap(arr);
        System.out.println(Arrays.toString(arr)); // [5, 2, 3, 4, 1]

        // Remove middle element(s)
        removeMiddleElement(arr);
        System.out.println(Arrays.toString(arr)); // [5, 2, 4, 1]

        // adjacent duplicates
        boolean hasDuplicates = adjDup(arr);
        System.out.println(hasDuplicates); // false

        // second largest element
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest); // 4

        // sum of elements
        int sum = sum(arr);
        System.out.println(sum); // 12
    }

}
