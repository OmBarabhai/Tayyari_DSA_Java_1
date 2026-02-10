package Arrays;

public class RevArr {
    public static void main(String[] args) {
        int[] arr={32,54,33,12,67,73,48,53,31};
        int n = arr.length-1;

        int i = 2;
        int j = 5;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

       while (i<j){


                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;

                i++;
                j--;

       }

//        while (i<j){
//
 //            arr[i]= arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }

       for(int ele : arr){
           System.out.print(ele+" ");
       }
    }
}
