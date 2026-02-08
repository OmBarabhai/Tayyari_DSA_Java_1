package if_else;

import java.util.Scanner;

public class OddOrEven {

    /*
    Check whether a number is even or odd.

    Rule:
    - If number % 2 == 0 → Even
    - Else → Odd

    Dry Run:
    Input: 6
    6 % 2 = 0 → Even

    Input: 7
    7 % 2 = 1 → Odd
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();   // input number

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
