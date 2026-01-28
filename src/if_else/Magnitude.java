package if_else;

import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        if( Math.abs(n) < 69){
            System.out.println("true");
        }
        else System.out.println("false");


    }
}
