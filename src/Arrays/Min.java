package Arrays;
import java.util.Scanner;
public class Min {
    public static void main(String[] args) {
        //code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] A = new int[n];


        int min = Integer.MAX_VALUE;
        for(int i =0; i<A.length;i++){

            if(A[i] < min) min = A[i];


        }
        System.out.print(min);

    }
}
