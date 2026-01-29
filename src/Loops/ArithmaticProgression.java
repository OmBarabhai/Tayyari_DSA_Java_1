package Loops;

import java.util.Scanner;

public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();
//        for (int i = 2; i <= 2+(n-1)*3; i+=3) {
//            System.out.print(i+ " ");
//
//
//        }
//        an = a + (n-i)*d
//        2 +(n-1)*3
//        2+3*n-3
//        3*n-1
//        for (int i = 4; i <= 6*n - 2; i += 6) {
//            System.out.print(i+" ");
//
//        }
        System.out.print("Enter Start Number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter Difference (d): ");
        int d = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("AP: " +a+" ");
            a+=d;
        }
    }
}
