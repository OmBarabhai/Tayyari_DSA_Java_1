package Arrays;

public class MulBy2OddIdxNdAddBy10EvenIdx {
    public static void main(String[] args) {
        int[] arr = {32,42,55,23,12,66};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Operations(arr);


    }

    public static void Operations(int[] x) {
        for(int i = 0;i<x.length;i++){

            if(i % 2 == 0){
                x[i] =x[i]+10;
            }
            else {
                x[i] = x[i]*2;
            }
            System.out.print(x[i]+" ");
        }

    }
}
