package if_else;

import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");

//        System.out.println(n+" is "+((n%2==0) ? "Even": "Odd" ));
        System.out.println((n%2==0) ? "Even": "Odd" );

    }
}
