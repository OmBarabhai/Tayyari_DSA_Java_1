package Arrays;

public class SecMax {
    public static void main(String[] args) {
        int[] arr = {43,55,22,55,46,12,99,99};
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > mx){
                mx = arr[i];
            }
        }

        int SecMx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != mx && arr[i] > SecMx){
                SecMx = arr[i];
            }
        }
        System.out.println(mx);
        System.out.println(SecMx);




    }
}
