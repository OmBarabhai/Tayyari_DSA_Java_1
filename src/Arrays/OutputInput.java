package Arrays;

import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
//        int[] arr = {5,6,34,-2,4,5,67,49,66};
//        System.out.println(arr.length);
//        int n =arr.length;//index: 0 to n-1
//        for (int i = 0; i <=n-1; i++) {
//        for (int i = 0; i <=n; i++) {
/*
       for (int i = 0; i < n; i++) {

            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int i = 0;
        while (i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }

 */
        int[] karan = new int[7];

        //default value
//        for (int i = 0; i < 7; i++) {
//            System.out.print(karan[i]+" ");// 0 0 0 0 0 0 0 0
//
//        }
        //i/p
        for (int i = 0; i < 7; i++) {
            karan[i] = sc.nextInt();
            karan[i]*=2;

        }
        //print
        for (int i = 0; i < 7; i++) {
            System.out.print(karan[i]+" ");

        }



    }

    public static class AddTwoArray {

    }
}
