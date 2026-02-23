package Arrays.Practice;

import java.util.Scanner;

public class RotateLeftByK {

    // Reverse function (same as before)
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // size of array
        int k = sc.nextInt();  // rotation steps

        int[] arr = new int[n];
        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Normalize k
        k = k % n;

        /*
        Example:
        arr = [1, 2, 3, 4, 5, 6], k = 2

        Step 1: Reverse first k elements
        reverse(0,1) → [2, 1, 3, 4, 5, 6]

        Step 2: Reverse remaining elements
        reverse(2,5) → [2, 1, 6, 5, 4, 3]

        Step 3: Reverse whole array
        reverse(0,5) → [3, 4, 5, 6, 1, 2]
        Final = Left Rotated Array
        */

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse full array
        reverse(arr, 0, n - 1);

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}