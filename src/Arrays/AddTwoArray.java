package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr1 = {3,2,6,2,1,9}; 
        int[] arr2 = {4,5,2,1,5};


        int carry = 0;

        int i = arr1.length-1;
        int j = arr2.length-1;

        while(i>=0 || j>=0 ||carry>0){

            int digit1 =0;
            int digit2 =0;
            if(i>=0){
             digit1 = arr1[i];
            }

            if(j>=0){
                digit2 =arr2[j];
            }
            int sum = digit1 + digit2 +carry;


            ans.add(sum%10);
            carry=sum/10;
            i--;
            j--;


        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
