package if_else;

import java.util.Scanner;

public class AbsoluteValue {

    /*
    Absolute value of a number.

    Rule:
    - If number is negative → convert to positive
    - Else → keep it same

    Dry Run:
    Input: -8
    n < 0 → true
    output = -(-8) = 8

    Input: 5
    n < 0 → false
    output = 5
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        if (n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }

        sc.close();
    }
}
