package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(2);
    }

    private static void pip(int n) {
        if(n==0) return;
        System.out.print("Pre: "+ n+" ");
        pip(n-1);
        System.out.print("In: "+n+" ");

        pip(n-1);
        System.out.print("Post: "+n+" ");

    }

}
