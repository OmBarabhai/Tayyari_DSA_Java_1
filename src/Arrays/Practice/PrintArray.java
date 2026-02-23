package Arrays.Practice;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 10, 5};
//        int max = 0;
        int max= Integer.MIN_VALUE;
        int SecMax= Integer.MIN_VALUE;

        int min= Integer.MAX_VALUE;
        int SecMin= Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > max) {
                SecMax = max;

                max = j;
            } else if (j > SecMax && j != max) {
                SecMax = j;
            }
            if (j < min) {
                SecMin = min;
                min = j;

            } else if (j < SecMin && j != min) {
                SecMin= j;
            }
        }

        if (SecMax == Integer.MIN_VALUE) {
            System.out.println("No Second Largest");
        } else {
            System.out.print(SecMax + " ");
        }

        if (SecMin == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest");
        } else {
            System.out.print(SecMin + " ");
        }

        System.out.print(SecMax+" ");
        System.out.print(SecMin+" ");

    }
}
