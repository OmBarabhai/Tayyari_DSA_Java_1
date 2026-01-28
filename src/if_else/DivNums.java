package if_else;

import java.util.Scanner;

public class DivNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        if(num % 5 == 0 && num % 3 == 0) System.out.println("Apurva");
        else if (num % 3 == 0) System.out.println("Banu");
        else if (num % 5 == 0) System.out.println("Riya");
        else System.out.println("Isha");
    }
}
