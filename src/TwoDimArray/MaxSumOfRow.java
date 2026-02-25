package TwoDimArray;

public class MaxSumOfRow {
    public static void main(String[] args) {
        int[][] arr = {{12,33,55},{14,77,8},{9,4,2}};
        int MaxSum =Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[0].length; j++) {
                 sum+=arr[i][j];
            }
//            MaxSum = Math.max(MaxSum,sum);
            if(sum>MaxSum){
                MaxSum = sum;
                row  =i;
            }

        }
        System.out.println(row+" "+MaxSum);
    }
}
