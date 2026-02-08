package Basic_Cheeze;

import java.util.Scanner;

public class InputOutputBasics {

    /*
    Input / Output:

    - Scanner → take input
    - println → print output

    Dry Run:
    Input: 5
    Output: 5
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();       // input
        System.out.println(x);      // output

        sc.close();
    }
}
