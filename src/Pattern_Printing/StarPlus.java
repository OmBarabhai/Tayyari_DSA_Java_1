package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();

        int n = sc.nextInt();

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                if(i==(m/2)+1||j==(n/2)+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();

        for(int i =1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if(i==j||i+j==m+1){
                    System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
