package Loops;

import java.util.Scanner;

public class printCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        int i=0;
//       for (int i =1;i<= n.length;i++){
//           System.out.println(i);
//       }
        if(n==0)n=9;
        while (n != 0){
            n = n/10;
            i++;

        }
        System.out.print(i);

    }
}
