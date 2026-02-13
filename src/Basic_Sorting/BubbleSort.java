package Basic_Sorting;

public class BubbleSort {

    // ------------------ PRINT METHOD ------------------
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // ------------------ 1. BASIC BUBBLE SORT ------------------
    public static void basicBubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // ------------------ 2. OPTIMIZED (BOOLEAN) ------------------
    public static void optimizedBubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            boolean swapped = false;

            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;  // stop early
        }
    }

    // ------------------ 3. SWAP COUNT VERSION ------------------
    public static void swapCountBubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int swapCount = 0;

            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }

            if(swapCount == 0) break;
        }
    }

    // ------------------ 4. RECURSIVE VERSION ------------------
    public static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1) return;

        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        recursiveBubbleSort(arr, n-1);
    }

    // ------------------ 5. DESCENDING ORDER ------------------
    public static void bubbleSortDescending(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] < arr[j+1]){  // only sign changed
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // ------------------ MAIN METHOD ------------------
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, -2, 5, 6, 7, 9};

        System.out.println("Original Array:");
        print(arr);

        // Choose which version you want to test:

        optimizedBubbleSort(arr);
        // basicBubbleSort(arr);
        // swapCountBubbleSort(arr);
        // recursiveBubbleSort(arr, arr.length);
        // bubbleSortDescending(arr);

        System.out.println("After Sorting:");
        print(arr);
    }
}
