package if_else;

import java.util.Scanner;

public class TernaryBasic {

    /*
    Ternary Operator:

    Syntax:
    condition ? value_if_true : value_if_false

    Used when:
    - Only one condition
    - Two possible results

    ---------------- DRY RUN ----------------

    Input: n = 6
    n % 2 == 0 → true
    Output → "Even"

    Input: n = 7
    n % 2 == 0 → false
    Output → "Odd"
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number

        // Ternary operator for even / odd
        System.out.println((n % 2 == 0) ? "Even" : "Odd");

        sc.close();
    }
}
