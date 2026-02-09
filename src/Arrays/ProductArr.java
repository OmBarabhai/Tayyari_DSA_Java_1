package Arrays;

import java.util.Scanner;

public class ProductArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int product=1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            product*=arr[i];

        }
        System.out.print(product);
    }
}
