package Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {23,44,21,55,23};

        if(isInArr(arr)) System.out.println("Element in array");
        else System.out.println("Element is not in array");
    }
    public static boolean isInArr(int[] y) {
        int x = 23;
//        for (int i = 0; i < y.length; i++) {
//            if(x == y[i]){
//                return true;
//            }
//        }
        for (int i : y) if (x == i) return true;
        return false;

    }
}
