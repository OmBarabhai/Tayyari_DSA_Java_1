package Basic_Cheeze;

import java.util.Scanner;

public class CharDT {

    /*
    char data type:
    - Stores a single character
    - Internally stored as an ASCII value (number)

    Common ASCII values:
    'A' = 65
    'a' = 97
    '0' = 48
    '1' = 49

    Important points:
    - char → int : implicit conversion (ASCII value)
    - int → char : explicit type casting
    - char can take part in arithmetic operations

    Dry Run:
    'A' → 65
    65  → 'A'
    '1' + '1' → 49 + 49 = 98
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // char to int (ASCII)
        char ch1 = 'A';
        System.out.println((int) ch1);   // 65

        // int to char (explicit casting)
        int x = sc.nextInt();
        char ch2 = (char) x;
        System.out.println(ch2);

        // char arithmetic
        char digit = '1';
        System.out.println(digit + digit); // 98

        sc.close();
    }
}
