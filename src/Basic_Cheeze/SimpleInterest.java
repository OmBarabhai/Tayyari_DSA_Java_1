package Basic_Cheeze;

import java.util.Scanner;

public class SimpleInterest {

    /*
    Simple Interest formula:
    SI = (P * R * T) / 100

    Dry Run:
    P = 1000, R = 5, T = 2
    SI = (1000 * 5 * 2) / 100
       = 10000 / 100
       = 100
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble(); // principal
        double r = sc.nextDouble(); // rate
        double t = sc.nextDouble(); // time

        double si = (p * r * t) / 100;

        System.out.println(si);

        sc.close();
    }
}
