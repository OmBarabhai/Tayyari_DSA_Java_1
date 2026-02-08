package Methods;

import java.util.Scanner;

public class PermutationNdCombination {

    public static int fact(int x){
        int f =1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/(fact(n-r));
        System.out.println("ncr: "+ncr);
        System.out.println("npr: "+npr);


//        int n_Fact = 1;
//        for (int i = 1; i <= n; i++) {
//            n_Fact *= i;
//        }

//        int r_Fact = 1;
//        for (int i = 1; i <= r; i++) {
//            r_Fact *= i;
//        }

//        int nr = 1;
//        for (int i = 1; i <= n - r; i++) {
//            nr *= i;
//        }

//        int ncr = n_Fact/(r_Fact * nr);
//        System.out.println(ncr);

        

    }
}
