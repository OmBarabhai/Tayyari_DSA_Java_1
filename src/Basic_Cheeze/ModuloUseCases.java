package Basic_Cheeze;

public class ModuloUseCases {

    /*
    Modulo (%) Operator:

    - Modulo gives the REMAINDER after division.
    - Think: what is LEFT after making equal groups.

    -------------------------------------------------
    IMPORTANT USE CASES (DSA + INTERVIEW)
    -------------------------------------------------

    1) Even / Odd check
       - If remainder after dividing by 2 is 0 → even
       - If remainder is 1 → odd

       Dry Run:
       10 % 2 = 0 → even
       11 % 2 = 1 → odd

    2) Get last digit of a number
       - Last digit = number % 10

       Dry Run:
       347 % 10 = 7

    3) Remove last digit
       - Remove last digit = number / 10

       Dry Run:
       347 / 10 = 34

    4) Process digits (VERY IMPORTANT IN DSA)
       - Used in: reverse number, palindrome, sum of digits

       Dry Run:
       459 % 10 = 9 → 459 / 10 = 45
       45 % 10 = 5  → 45 / 10 = 4
       4 % 10 = 4

    5) Divisibility check
       - If num % k == 0 → divisible by k

       Dry Run:
       21 % 3 = 0 → divisible
       22 % 3 = 1 → not divisible

    6) Circular indexing (ARRAY / DSA)
       - Used when index exceeds array size

       Dry Run:
       index = 7, size = 5
       7 % 5 = 2

    -------------------------------------------------
    KEY IDEA:
    -------------------------------------------------
    Modulo is used when you need:
    - remainder
    - last digit
    - condition checking
    - circular movement
    */

    public static void main(String[] args) {

        // 1) Even / Odd
        int num = 11;
        System.out.println(num % 2 == 0); // false → odd

        // 2) Last digit
        int number = 347;
        System.out.println(number % 10);  // 7

        // 3) Remove last digit
        System.out.println(number / 10);  // 34

        // 4) Process all digits
        int n = 459;
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

        // 5) Divisibility check
        int value = 21;
        System.out.println(value % 3 == 0); // true

        // 6) Circular index
        int index = 7;
        int size = 5;
        System.out.println(index % size);   // 2
    }
}
