package TwoDimArray;

import java.util.ArrayList;

public class SpiralMat {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> SpiralMatrix(int[][] arr){
        ArrayList<Integer>ans = new ArrayList<>();
        int fc = 0, lc = arr[0].length-1, fr = 0,lr = arr.length-1;

        while (fc<=lc && fr<=lr){
            for (int j = fc; j <= lc; j++)
               ans.add(arr[fr][j]);
            fr++;
            if(fc>lc||fr>lr) break;
            for (int i = fr; i <= lr ; i++)
                ans.add(arr[i][lc]);
            lc--;
            if(fc>lc||fr>lr) break;

            for (int j = lc; j >= fc ; j--)
                ans.add(arr[lr][j]);
            lr--;
            if(fc>lc||fr>lr) break;

            for (int i = lr; i >= fr; i--)
                ans.add(arr[i][fc]);
            fc++;
            if(fc>lc||fr>lr) break;

        }
        return ans;
    }
}
