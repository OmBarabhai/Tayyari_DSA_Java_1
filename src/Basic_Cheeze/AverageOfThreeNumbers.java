package Basic_Cheeze;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    /*
    Average formula:
    average = (a + b + c) / 3

    Dry Run:
    a = 10, b = 20, c = 30
    sum = 10 + 20 + 30 = 60
    avg = 60 / 3 = 20
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.println(avg);

        sc.close();
    }
}
