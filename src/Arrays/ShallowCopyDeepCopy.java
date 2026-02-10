package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a = 4;//4 byte leta hy
        int[] arr = {58,34,23,94,34,35};//16 byte leta hy
        System.out.println(arr[0]);
        int[] x = arr;//x is a shallow copy of arr(like a paper which have some name and we change name on paper not a paper that paper is we can refer by both name)
        System.out.println(x[0]);
        x[0] = 32;
        System.out.println(arr[0]);


        int[] y = Arrays.copyOf(arr,arr.length);//deep copy we are creating new array if we change in new array it does not affect to the original array
        y[0]= 20;
        System.out.println(arr[0]);
        System.out.println(y[0]);

        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {//deep-copy
            brr[i] = arr[i];
            System.out.print(brr[i]+ " ");

        }

    }
}
