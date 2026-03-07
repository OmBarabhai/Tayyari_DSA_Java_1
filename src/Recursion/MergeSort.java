package Recursion;

import static java.io.ObjectInputFilter.merge;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,4,3,7,9,0,1,6};
        mergeSort(arr);
//        System.out.println(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1)return;
        int[] a = new int[n/2]; int[] b = new int[n-n/2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);

        merge(a,b,arr);


    }


    static void merge(int[] a,int[] b,int[] c){
        int i =0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if(a[i]< b[j]){
                c[k++] = a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];

    }
    int missingNum(int arr[]) {
        int n = 1+arr.length;
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1)i++;
            else{
                int idx = arr[i] - 1;
                swap(arr,i,idx);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[i]!=i+1) return i+1;
        }

        return n;
    }

    private void swap(int[] arr,int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }


}
