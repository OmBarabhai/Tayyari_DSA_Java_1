package if_else;

import java.util.Scanner;

public class GreatestOfThree {

    /*
    Find the greatest among three numbers.

    Dry Run:
    a = 10, b = 20, c = 15

    a >= b → false
    b >= c → true
    Output = 20
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // -------------------------------
        // Method 1: Nested if-else (BASIC)
        // -------------------------------
        /*
        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        */

        // --------------------------------
        // Method 2: if-else with AND (BEST)
        // --------------------------------
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        // -------------------------------
        // Method 3: Ternary Operator
        // -------------------------------

        /*
        System.out.println(
                (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c)
        );
        */

        sc.close();
    }
}
