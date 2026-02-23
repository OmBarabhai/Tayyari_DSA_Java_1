package Arrays;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] n = new int[10];
for(int i : n) {
    arr.add(i);
//    arr.add(5);
//    arr.add(7);
//    arr.add(4);
//    arr.add(49);

    System.out.println(n[i]);
    arr.set(2, 9);
    System.out.println(arr);
}
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i)+" ");
//
//        }
//        System.out.println();
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

//        arr.add(99);
//        System.out.println(arr+" ");
//        arr.add(3,55);
//        System.out.println(arr+" ");

    }
}
