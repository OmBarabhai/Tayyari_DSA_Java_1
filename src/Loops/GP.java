package Loops;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            a*=r;
        }
    }
}
