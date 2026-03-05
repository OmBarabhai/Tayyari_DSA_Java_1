package Recursion;

import java.util.*;

public class SubString {

    public static void main(String[] args) {

        // Subsequence of String
        String s = "abc";
        List<String> stringList = new ArrayList<>();
        printSubsequence("", s, 0, stringList);
        System.out.println("Before Sort Subsequences: " + stringList);
        Collections.sort(stringList);
        System.out.println("After Sort Subsequences: " + stringList);

        System.out.println();

        // Subset Sum of Array
        int[] arr = {1, 2, 1};
        List<Integer> sumList = new ArrayList<>();
        printSubsetSum(0, arr, 0, sumList);
        System.out.println("Before Sort Subset Sums: " + sumList);

        Collections.sort(sumList);
        System.out.println("After Sort Subset Sums: " + sumList);
    }

    // Function to print all subsequences
    public static void printSubsequence(String current, String s, int index, List<String> list) {

        if (index == s.length()) {
            if(current.length()!=0)list.add(current);
            return;
        }

        // Include character
        printSubsequence(current + s.charAt(index), s, index + 1, list);

        // Exclude character
        printSubsequence(current, s, index + 1, list);
    }

    // Function to calculate subset sums
    public static void printSubsetSum(int sum, int[] arr, int index, List<Integer> list) {

        if (index == arr.length) {
           if(sum != 0) list.add(sum);
            return;
        }

        // Include element
        printSubsetSum(sum + arr[index], arr, index + 1, list);

        // Exclude element
        printSubsetSum(sum, arr, index + 1, list);
    }
}