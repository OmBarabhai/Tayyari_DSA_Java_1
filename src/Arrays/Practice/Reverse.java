package Arrays.Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 1: Input array elements
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;

        // Step 2: Reverse using two pointers
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Step 3: Print reversed array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}