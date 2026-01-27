package if_else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double n = sc.nextDouble();//n= 3.14 || n=1.00

        if(n == (int)n) System.out.println("Is an Integer");//3.14-3.00 = 0.14 (0.14 > 0)sout(Not Integer)
        else System.out.println("Is Not Integer");//1.0 - 1.0 = 0 (0>0)sout(is an Integer);
    }
}
