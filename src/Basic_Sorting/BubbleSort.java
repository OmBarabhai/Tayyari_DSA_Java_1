package Basic_Sorting;

public class BubbleSort {

    public static  void print(int[] num){
        for(int ele: num){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,-2,5,6,7,9};
        int n = arr.length;
//        boolean isSorted =true;

        print(arr);
        for(int i =0;i<=n-1;i++){
            boolean isSorted =true;

            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) break;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);


        for(int i =0;i<=n-1;i++) {
            int SwapCount = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    SwapCount++;
                }
            }
            if(SwapCount==0) break;

        }

        print(arr);


//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);


    }
}
