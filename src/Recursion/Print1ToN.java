package Recursion;

import java.util.Scanner;

public class Print1ToN {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        priya(1);
    }
    public static void priya(int x){
        if (x > n) return;
//        System.out.println(x);
//        priya(x+1, n);

        System.out.println(x+") "+ "OM Before Funtion Call");
        priya(x+1);
        System.out.println(x +") "+ "OM After function Call Rich to base case ");
    }

}
