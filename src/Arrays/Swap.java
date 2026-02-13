package Arrays;

public class Swap {

    public static void print(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swapAlt(int[] arr, int size){

        for (int i = 0; i < size; i+=2) {
            if(i+1<size) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int[] even= {5,2,9,4,7,6,1,0};
        int[] odd = {11,22,66,88,33,22};


        swapAlt(even , 8);
        print(even,8);

        System.out.println();

        swapAlt(odd , 6);
        print(odd,6);


    }
}
