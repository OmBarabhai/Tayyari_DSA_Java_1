package if_else;

import java.util.Scanner;

public class LeastOfThree {

    /*
    Find the smallest among three numbers.

    Dry Run:
    a = 10, b = 5, c = 8

    a <= b → false
    b <= c → true
    Output = 5
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b) {
            if (a <= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b <= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }

        sc.close();
    }
}
