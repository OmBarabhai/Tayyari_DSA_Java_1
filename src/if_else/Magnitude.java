package if_else;

import java.util.Scanner;

public class Magnitude {

    /*
    Check the magnitude of a number.

    Meaning of Magnitude:
    - Magnitude is the distance of a number from 0.
    - Negative sign does not matter.

    Rule:
    - If |n| < 69 → true
    - Else → false

    -------- DRY RUN --------

    Input: n = -50
    | -50 | = 50
    50 < 69 → true

    Input: n = 70
    | 70 | = 70
    70 < 69 → false
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        if (Math.abs(n) < 69) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
