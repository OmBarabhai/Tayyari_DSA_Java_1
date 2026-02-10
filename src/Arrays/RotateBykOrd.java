package Arrays;

import java.util.Scanner;

public class RotateBykOrd {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int n = arr.length;

            System.out.println("Original Array:");
            printWithIndex(arr);

            System.out.print("\nEnter rotation value (k or d): ");
            int k = sc.nextInt();

            System.out.println("\n--- Modulo Calculation ---");
            System.out.println("Array length (n) = " + n);
            System.out.println("Given rotation value = " + k);
            System.out.println("k % n = " + (k % n));

            k = k % n;
            System.out.println("Effective rotation = " + k);
            System.out.println("Rotation pivot index = " + k);

            // -------- LEFT ROTATION --------
            int[] left = arr.clone();

            System.out.println("\n================ LEFT ROTATION ================");

            reverse(left, 0, k - 1);
            System.out.println("\nAfter reversing index 0 to " + (k - 1));
            printWithIndex(left);

            reverse(left, k, n - 1);
            System.out.println("\nAfter reversing index " + k + " to " + (n - 1));
            printWithIndex(left);

            reverse(left, 0, n - 1);
            System.out.println("\nAfter reversing index 0 to " + (n - 1));
            printWithIndex(left);

            // -------- RIGHT ROTATION --------
            int[] right = arr.clone();

            System.out.println("\n================ RIGHT ROTATION ================");

            reverse(right, 0, n - 1);
            System.out.println("\nAfter reversing index 0 to " + (n - 1));
            printWithIndex(right);

            reverse(right, 0, k - 1);
            System.out.println("\nAfter reversing index 0 to " + (k - 1));
            printWithIndex(right);

            reverse(right, k, n - 1);
            System.out.println("\nAfter reversing index " + k + " to " + (n - 1));
            printWithIndex(right);

            sc.close();
        }

        // Reverse helper
        public static void reverse(int[] arr, int i, int j) {
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Prints index -> value mapping
        public static void printWithIndex(int[] arr) {
            System.out.print("Index : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("Value : ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
