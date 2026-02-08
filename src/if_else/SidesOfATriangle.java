package if_else;

import java.util.Scanner;

public class SidesOfATriangle {

    /*
    Check whether three sides form a valid triangle.

    Condition (ALL must be true):
    a + b > c
    b + c > a
    a + c > b

    -------- VALID DRY RUN --------
    a = 3, b = 4, c = 5

    a + b = 7 > 5  ✔
    b + c = 9 > 3  ✔
    a + c = 8 > 4  ✔

    Result: Valid Triangle

    -------- INVALID DRY RUN --------
    a = 1, b = 2, c = 3

    a + b = 3 > 3  ✘ (fails)

    Result: Invalid Triangle
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
