package Methods;

import java.util.Scanner;

public class Swap {
//    public static int swap(int a,int b){
public static void swap(int a,int b){

        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+ " " +b);


//        return swap(5,6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+ " " +b);

        swap(5,6);
        System.out.println(a+ " " +b);



    }
}
