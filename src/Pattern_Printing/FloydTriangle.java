package Pattern_Printing;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;

        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        int b =1;

        for(int i =1;i<=n;i++){
            for(int j = 1;j<=b;j++){
                 System.out.print(j++ +" ");
            }
            b = b+2;
            System.out.println();
        }
    }

}
