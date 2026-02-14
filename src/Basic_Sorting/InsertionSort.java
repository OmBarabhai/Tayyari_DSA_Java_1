package Basic_Sorting;

import static Basic_Sorting.BubbleSort.print;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,21,4,7,8,9};

        int n = arr.length;

        print(arr);

        for (int i = 0; i < n; i++) {

            int j =i;
            while (j>0 && arr[j]<arr[j-1]){
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;

               j--;
            }

        }
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
