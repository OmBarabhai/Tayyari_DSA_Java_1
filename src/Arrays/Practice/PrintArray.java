package Arrays.Practice;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 10, 5};
//        int max = 0;
        int max= Integer.MIN_VALUE;
        int SecMax= Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                SecMax = max;

                max = j;
            } else if (j > SecMax && j != max) {
                SecMax = j;
            }
        }
        System.out.print(SecMax+" ");
    }
}
