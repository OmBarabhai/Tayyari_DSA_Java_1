package Recursion;

import java.util.*;

public class RecursionFullRevision {

    public static void main(String[] args) {

        // ================= BASIC RECURSION =================
        System.out.println("Print N → 1");
        printNto1(5);

        System.out.println("\nPrint 1 → N");
        print1toN(5);

        System.out.println("\nFactorial");
        System.out.println(fact(5));

        System.out.println("\nFibonacci");
        System.out.println(fib(6));

        // ================= DIVIDE RECURSION =================
        System.out.println("\nBinary Search");
        int[] arr = {2,4,6,8,10,12};
        System.out.println(binarySearch(arr,8,0,arr.length-1));

        // ================= ARRAY RECURSION =================
        System.out.println("\nReverse Array");
        int[] nums = {1,2,3,4,5};
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

        // ================= STRUCTURE RECURSION =================
        System.out.println("\nTower Of Hanoi");
        hanoi(3,'A','B','C');

        // ================= SORT ARRAY RECURSION =================
        int[] arr2 = {4,2,5,1};
        sortArray(arr2,arr2.length);
        System.out.println("\nSorted Array: " + Arrays.toString(arr2));

        // ================= SUBSET PATTERN =================
        System.out.println("\nSubsets");
        subsets("abc","");

        // ================= PERMUTATION PATTERN =================
        System.out.println("\nPermutation With Spaces");
        permuteSpaces("BC","A");

        // ================= CONSTRAINT RECURSION =================
        System.out.println("\nBalanced Parentheses");
        generateParentheses(3,3,"");

        // ================= SPECIAL RECURSION =================
        System.out.println("\nJosephus Problem");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=7;i++) list.add(i);
        System.out.println(josephus(list,0,3));
    }


    // =================================================
    // BASIC RECURSION
    // Recognize: smaller version of same problem
    // =================================================
    static void printNto1(int n){

        if(n==0) return;

        System.out.print(n+" ");

        printNto1(n-1);
    }

    static void print1toN(int n){

        if(n==0) return;

        print1toN(n-1);

        System.out.print(n+" ");
    }


    // =================================================
    // MATHEMATICAL RECURSION
    // =================================================
    static int fact(int n){

        if(n==0 || n==1) return 1;

        return n * fact(n-1);
    }


    // =================================================
    // MULTIPLE RECURSION
    // =================================================
    static int fib(int n){

        if(n<=1) return n;

        return fib(n-1) + fib(n-2);
    }


    // =================================================
    // DIVIDE RECURSION
    // =================================================
    static int binarySearch(int[] arr,int target,int lo,int hi){

        if(lo>hi) return -1;

        int mid = lo + (hi-lo)/2;

        if(arr[mid]==target)
            return mid;

        else if(arr[mid]<target)
            return binarySearch(arr,target,mid+1,hi);

        else
            return binarySearch(arr,target,lo,mid-1);
    }


    // =================================================
    // ARRAY RECURSION
    // =================================================
    static void reverse(int[] arr,int i,int j){

        if(i>=j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr,i+1,j-1);
    }


    // =================================================
    // STRUCTURE RECURSION
    // =================================================
    static void hanoi(int n,char src,char aux,char dest){

        if(n==0) return;

        hanoi(n-1,src,dest,aux);

        System.out.println("Move disk "+n+" from "+src+" → "+dest);

        hanoi(n-1,aux,src,dest);
    }


    // =================================================
    // SORT ARRAY USING RECURSION
    // =================================================
    static void sortArray(int[] arr,int n){

        if(n==1) return;

        sortArray(arr,n-1);

        insert(arr,n-1);
    }

    static void insert(int[] arr,int i){

        while(i>0 && arr[i] < arr[i-1]){

            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;

            i--;
        }
    }


    // =================================================
    // SUBSET PATTERN (CHOICE RECURSION)
    // include / exclude
    // =================================================
    static void subsets(String input,String output){

        if(input.length()==0){

            System.out.println(output);

            return;
        }

        subsets(input.substring(1),output);

        subsets(input.substring(1),output + input.charAt(0));
    }


    // =================================================
    // PERMUTATION PATTERN
    // =================================================
    static void permuteSpaces(String input,String output){

        if(input.length()==0){

            System.out.println(output);

            return;
        }

        permuteSpaces(input.substring(1),output+" "+input.charAt(0));

        permuteSpaces(input.substring(1),output+input.charAt(0));
    }


    // =================================================
    // CONSTRAINT RECURSION
    // =================================================
    static void generateParentheses(int open,int close,String output){

        if(open==0 && close==0){

            System.out.println(output);

            return;
        }

        if(open>0)
            generateParentheses(open-1,close,output+"(");

        if(close>open)
            generateParentheses(open,close-1,output+")");
    }


    // =================================================
    // SPECIAL RECURSION
    // Josephus Problem
    // =================================================
    static int josephus(ArrayList<Integer> list,int index,int k){

        if(list.size()==1)
            return list.get(0);

        index = (index + k - 1) % list.size();

        list.remove(index);

        return josephus(list,index,k);
    }

}