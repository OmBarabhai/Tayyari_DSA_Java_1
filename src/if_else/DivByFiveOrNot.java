package if_else;

import java.util.Scanner;

public class DivByFiveOrNot {

    /*
    Check whether a number is divisible by 5.

    Rule:
    - If number % 5 == 0 → divisible
    - Else → not divisible

    Dry Run:
    Input: 20
    20 % 5 = 0 → Divisible by 5

    Input: 23
    23 % 5 = 3 → Not Divisible by 5
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }

        sc.close();
    }
}
