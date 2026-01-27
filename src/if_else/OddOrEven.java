package if_else;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Number is Even: "+ x);
        }
        else{
            System.out.println("Number is Odd: "+ x);
        }
    }
}
