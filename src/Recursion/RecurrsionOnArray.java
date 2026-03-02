package Recursion;

import java.util.Arrays;

public class RecurrsionOnArray {
    public static void main(String[] args) {
        int[] arr= {23,43,55,4,3,2,1};
//        int target = 99;
        int n = arr.length;
//        System.out.println(exits(arr,target,0));
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    private static boolean exits(int[] arr, int target, int idx) {
//        for(int i= 0;i<arr.length-1;i++){
//         if(arr[i] == ele){
//             return true;
//         }
//        }
//        return false;
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return exits(arr,target,idx+1);
    }

    public static void reverse(int[] arr, int lo,int hi){

            if(lo>hi)return;

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            reverse(arr,lo+1,hi - 1);



    }
}
