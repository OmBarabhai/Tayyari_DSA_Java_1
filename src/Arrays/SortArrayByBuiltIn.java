package Arrays;

import java.util.Arrays;

public class SortArrayByBuiltIn {
    public static void main(String[] args) {
        int[] arr = {49,34,23,55,32};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
