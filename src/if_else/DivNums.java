package if_else;

import java.util.Scanner;

public class DivNums {

    /*
    Print based on divisibility:

    Rules:
    - If divisible by both 3 and 5 → "Apurva"
    - If divisible by only 3 → "Banu"
    - If divisible by only 5 → "Riya"
    - Else → "Isha"

    IMPORTANT:
    Check (3 AND 5) first, otherwise it will never reach.

    -------- DRY RUNS --------

    Input: 15
    15 % 3 == 0 → true
    15 % 5 == 0 → true
    Output: Apurva

    Input: 9
    9 % 3 == 0 → true
    9 % 5 == 0 → false
    Output: Banu

    Input: 10
    10 % 3 == 0 → false
    10 % 5 == 0 → true
    Output: Riya

    Input: 7
    7 % 3 == 0 → false
    7 % 5 == 0 → false
    Output: Isha
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // input number

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Apurva");
        }
        else if (num % 3 == 0) {
            System.out.println("Banu");
        }
        else if (num % 5 == 0) {
            System.out.println("Riya");
        }
        else {
            System.out.println("Isha");
        }

        sc.close();
    }
}
