package Basic_Sorting;

public class BubbleSortINDec {
    public static void print(int[] num){
        for(int ele:num){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,7,9};
//        print(arr);
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            boolean isSorted =false;
//
//            for (int j = 0; j < n-1-i; j++) {
//                if(arr[j]<arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] =temp;
//
//                    isSorted = true;
//
//                }
//
//
//            }
//            System.out.println();
//            if(!isSorted)break;
//            print(arr);
//
//        }

        int[] arr1= {-1,4,2,6,7,4,7,8};

        print(arr1);

        int n = arr1.length;

        for (int i = n-1; i >=0; i--) {
            int max = Integer.MIN_VALUE;
            int max_idx = 0;

            for (int j = 0; j <= i; j++) {
                if(arr1[j] > max){
                    max =arr1[j];
                    max_idx = j;
                }
            }

//            print(arr1);
//            System.out.println();
            int temp = arr1[max_idx];
            arr1[max_idx] =arr1[i];
            arr1[i] = temp;
//            print(arr1);
//            System.out.println();
        }
        print(arr1);








    }
}
