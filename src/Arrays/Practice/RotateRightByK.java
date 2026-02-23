package Arrays.Practice;

import java.util.Scanner;

public class RotateRightByK {

    // Function to reverse array from index i to j
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

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Important: normalize k (handles k > n)
        k = k % n;

        /*
        Example:
        arr = [1, 2, 3, 4, 5, 6], k = 2

        Step 1: Reverse whole array
        [6, 5, 4, 3, 2, 1]

        Step 2: Reverse first k elements (0 to k-1)
        reverse(0,1) → [5, 6, 4, 3, 2, 1]

        Step 3: Reverse remaining elements (k to n-1)
        reverse(2,5) → [5, 6, 1, 2, 3, 4]
        Final = Right Rotated Array
        */

        // Step 1: Reverse full array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}