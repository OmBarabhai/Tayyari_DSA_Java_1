package Loops;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

//        int i = 0;
//        while(n!=0)
        if(n < 0) n = -n;
        while (n!=0){
            sum += (n%10);
            n=n/10;

//            i++;
        }
//        System.out.print((sum>0)? sum: -sum);
        System.out.print(sum);



    }
}
