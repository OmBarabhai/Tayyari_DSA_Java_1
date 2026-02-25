package TwoDimArray;

public class MaxEle {
    public static void main(String[] args) {
        int[][] arr = {{12,3,5},{14,77,8},{9,4,2}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    if(arr[i][j]>max){
                        max = arr[i][j];
                    }
            }
        }
        System.out.print(max);
    }
}
