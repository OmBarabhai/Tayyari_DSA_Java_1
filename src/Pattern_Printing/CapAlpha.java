package Pattern_Printing;

import java.util.Scanner;

public class CapAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<=n;j++){
//                System.out.print((char) (j+64)+" ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();
//
//        for (int i = 1; i <=n ; i++) {
//            for(int j = 1;j<=n;j++){
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=n;j++){
//                System.out.print((char) (i+64)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();


        for (int i = 1; i <=n ; i++) {
            char ch;
            if(i%2==1)ch = (char) (i+96);
            else ch = (char)(i+64);

            for (int j = 1;j<=n;j++) {
                System.out.print(ch);

            }
            System.out.println();

//            System.out.println();



        }
    }
}
