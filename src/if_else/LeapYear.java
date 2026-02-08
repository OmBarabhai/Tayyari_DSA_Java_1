package if_else;

import java.util.Scanner;

public class LeapYear {

    /*
    Check whether a year is a leap year.

    Rules:
    - If year is divisible by 400 → Leap Year
    - OR
    - If year is divisible by 4 AND NOT divisible by 100 → Leap Year
    - Else → Not a Leap Year

    -------- DRY RUN --------

    Example 1:
    Year = 2000
    2000 % 400 == 0 → true
    Output: Leap Year

    Example 2:
    Year = 1900
    1900 % 100 == 0 → true
    1900 % 400 != 0 → false
    Output: Not a Leap Year

    Example 3:
    Year = 2024
    2024 % 4 == 0 → true
    2024 % 100 != 0 → true
    Output: Leap Year
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();   // input year

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
