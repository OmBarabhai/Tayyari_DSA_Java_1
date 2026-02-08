package if_else;

import java.util.Scanner;

public class IsInteger {

    /*
    Check whether a number is an integer.

    Rule:
    - If number == (int) number → Integer
    - Else → Not Integer

    Dry Run:
    Input: 3.14
    (int)3.14 = 3
    3.14 != 3 → Not Integer

    Input: 5.0
    (int)5.0 = 5
    5.0 == 5 → Integer
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();   // input number

        if (n == (int) n) {
            System.out.println("Is Integer");
        } else {
            System.out.println("Not Integer");
        }

        sc.close();
    }
}
