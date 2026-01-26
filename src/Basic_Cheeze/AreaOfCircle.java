package Basic_Cheeze;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double a = sc.nextDouble()*r*r;
        System.out.println(a);

        System.out.println("Enter Number: ");

        int Number = sc.nextInt();
        int square = Number * Number;

        System.out.println( Number+" Square is : "+square);

    }
}
