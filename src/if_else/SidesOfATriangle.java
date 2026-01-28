package if_else;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");

        int a = sc.nextInt();
        System.out.print("Enter 2st Side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3st Side: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("InValid Triangle");
        }

    }
}
