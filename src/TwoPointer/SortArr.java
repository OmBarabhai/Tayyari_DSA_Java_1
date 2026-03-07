package TwoPointer;

import javax.swing.*;
import java.util.Scanner;

public class SortArr {
    public static void print(int[] arr){
//        long n = arr.length;
        for(int ele:arr){
            System.out.print(ele);
        }
        System.out.println();
    }

    static void reverse(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroNdOnes(int[] arr){
        int n = arr.length;
        int countzero = 0;
        for (int i = 0; i < n; i++) {
           if(arr[i]==0){
               countzero++;
           }
        }
        for (int i = 0; i < n; i++) {
            if(i<countzero){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        print(arr);
        sortZeroNdOnes(arr);
        System.out.println("Sorted Array: ");
        print(arr);



    }
}
