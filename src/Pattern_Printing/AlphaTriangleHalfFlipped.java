package Pattern_Printing;

import java.util.Scanner;

public class AlphaTriangleHalfFlipped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=a;j++){
                System.out.print((char) (j+96));
            }
            a--;
            System.out.println();

        }
        System.out.println();

        int b = n;

        for (int i = 1; i <=n ; i++) {
            for(int j =1;j <= b;j++){
                System.out.print((char) (i+64));
            }
            b--;
            System.out.println();

        }
    }
}
