package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean flag =true;


//        int x = 0;//0 means prime
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.print(" "+i+" ");
                if(i!=n/i){
                    System.out.print(n/i);

                }


                flag= false;

//                break;

            }
        }
        if (n==1) System.out.println("neither Prime or not Composite");
        else if(flag)System.out.println("Prime Number");
        else System.out.println("Composite");


    }
}
