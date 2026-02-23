package Recursion;

public class Reverse {
    static int rev;
    public static void reverse(int n){
        if(n==0)  return;
        int lastDigit = n%10;
         rev = rev * 10+lastDigit;
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 12342;
        reverse(n);
        System.out.print(rev+" ");
    }
}
