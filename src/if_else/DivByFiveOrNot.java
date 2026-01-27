package if_else;

import java.util.Scanner;

public class DivByFiveOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println("It is divisible by 5");
        }
        else {
            System.out.println("it is not divisible by 5");
        }
    }
}
