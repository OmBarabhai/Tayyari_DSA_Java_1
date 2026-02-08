package if_else;

import java.util.Scanner;

public class FourDigitNum {

    /*
    Check whether a number is a 4-digit number.

    Condition:
    n >= 1000 && n <= 9999

    -------- DRY RUN --------
    Input: 1234
    1234 >= 1000 → true
    1234 <= 9999 → true
    Output: 4 Digit Number

    Input: 99
    99 >= 1000 → false
    Output: Not a 4 Digit Number
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        if (n >= 1000 && n <= 9999) {
            System.out.println("4 Digit Number");
        } else {
            System.out.println("Not a 4 Digit Number");
        }

        sc.close();
    }
}
