package ARRAYS_STRING_BINSEARCH_2DARRAY.TwoDimArray;

public class ForEach {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{1,7,8},{9,4,2}};

        for (int[] a :  arr){
            for(int j : a){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
