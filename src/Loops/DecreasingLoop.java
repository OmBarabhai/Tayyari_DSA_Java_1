package Loops;

import java.util.Scanner;

public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");

        }
    }
}
