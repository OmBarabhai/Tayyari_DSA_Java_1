package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        priya(5);
    }
    public static void priya(int n){
        if(n==0) return ;
        System.out.println(n +") "+ "OM");
//        System.out.println(n);
        priya(n-1);
        System.out.println(n +") "+ "OM");


    }
}
