package BinSearch;

public class DecOrder {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,4,3};

        int low= 0;
        int high = arr.length-1;

        int ans = -3;
        int target = 9;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>target){
                low = mid+1;
            }
            else if(arr[mid]<target){
                high = mid-1;
            }
           else{
              ans =mid;
              break;
            }
        }
        System.out.print(ans+" ");




    }

}
