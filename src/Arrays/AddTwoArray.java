package Arrays;

import java.util.ArrayList;
import java.util.Collections;
public class AddTwoArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr1 = {3,2,6,2,1,9}; //{3,2,6,2,1,9},{3,2,6,2,1},{3,2,6,2},{3,2,6},{3,2},{3},{0}
        int k = 345;//345, 34, 3 , 0 ,0,0,0


        int carry = 0;//1,0,0,0,0,0

        int i = arr1.length-1;//n-1,n-2,n-3,n-4,n-5,n-6,
//        int j = arr2.length-1;

        while(i>=0 || k >0 ||carry>0){//i = 0, k =0, carry =0

            int digit1 =0;//9,1,2,6,2,3
            int digit2 =0;//5,4,3,0,0,0
            if(i>=0){//i =0
             digit1 = arr1[i];//9, 1, 2, 6, 2, 3
            }

            if(k>0){//k=0
//                digit2 =arr2[j];
                digit2 = k % 10;// 345 % 10 = 5, 34 % 10 = 4, 3 % 10 = 3
                k = k / 10;// 345 / 10 = 34, 34 / 10 = 3, 3 / 10 = 0

            }
            int sum = digit1 + digit2 + carry; // 9 + 4 + 0 = 14, 1 + 4 + 1 = 6, 2 + 3 + 0 = 5, 6 + 0 + 0 = 6, 2 + 0 + 0 = 2, 3 + 0 + 0 = 3,


            ans.add(sum%10);//14 % 10 = 4  {4, 6, 5, 6, 2, 3}
            carry=sum/10;//14 / 10 = 1 , 6 / 10 = 0, 5 / 10 = 0, 6/10 =0,2/10 = 0,3/10 =0,
            i--;//n-2 ,n-3,n-4 ,n-5,n-6
//            j--;

        }
        Collections.reverse(ans);//{3,2,6,5,6,4}
        System.out.println(ans);
    }
}
