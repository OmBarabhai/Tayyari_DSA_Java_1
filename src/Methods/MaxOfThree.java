package Methods;

public class MaxOfThree {
/*    public static void max(int a, int b, int c){
        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a&&b>=c) System.out.println(b);
        else System.out.println(c);
      }*/

    public static int max(int a, int b, int c){
      /*
       if(a>=b && a>=c) return a;
//       X else if(b>=a&&b>=c) return b;
//       X else return c;//if in the only one return statement then it gives error then we have to give int return type return 0;
        */

        if(a>=b && a>=c) return a;
        else if(b>=a&&b>=c) return b;
        else return c;
    }
    public static void main(String[] args) {
        System.out.println(max(3,4,5));
        max(3,6,2);



    }
}
