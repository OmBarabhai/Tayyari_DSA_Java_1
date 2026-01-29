package Loops;

import java.util.Scanner;

public class HW99uptopositve {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input starting number (e.g., 99)
        System.out.print("Enter the Start number (a): ");
        int a = sc.nextInt();

        // Input difference (e.g., 4)
        System.out.print("Enter the Difference (d): ");
        int d = sc.nextInt();

        System.out.println("\nMethod 1 Output:");

        /*
         * =========================
         * METHOD 1
         * =========================
         * - 'i' is used only for looping
         * - Loop condition depends on value of 'a'
         * - Stops when 'a' becomes non-positive
         */

        int tempA = a;   // store original value

        for (int i = 1; tempA > 0; i++) {
            System.out.print(tempA + " ");
            tempA = tempA - d;
        }

        System.out.println("\n\nMethod 2 Output:");

        /*
         * =========================
         * METHOD 2
         * =========================
         * - 'i' itself holds the term value
         * - Loop condition depends on 'i'
         * - Value is updated in for loop statement
         */

        for (int i = a; i > 0; i = i - d) {
            System.out.print(i + " ");
        }

        // Close the scanner
        sc.close();
    }
}
