package TwoDimArray;

import java.util.Scanner;

public class OP_In_TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int m = sc.nextInt(); // rows
//        int n = sc.nextInt(); // columns

        int[][] arr = new int[3][2];

        // Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}