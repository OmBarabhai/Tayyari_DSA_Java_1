package TwoDimArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{1,7,8},{9,4,2}};
        print(arr);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        print(arr);



    }
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int j: a){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
