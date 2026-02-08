package Basic_Cheeze;

import java.util.Scanner;

public class AreaOfCircle {

    /*
    Area of circle:
    area = π * r * r

    Dry Run:
    r = 7
    area = 3.14 * 7 * 7
         = 153.86
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();          // radius
        double area = Math.PI * r * r;       // calculate area

        System.out.println(area);            // output

        sc.close();
    }
}
