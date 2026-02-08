package Basic_Cheeze;

import java.util.Scanner;

public class SquareOfNumber {

    /*
    Square of a number:
    square = n * n
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number
        int square = n * n;     // calculate square

        System.out.println(square); // output

        sc.close();
    }
}
