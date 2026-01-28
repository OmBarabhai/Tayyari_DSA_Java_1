package if_else;

import java.util.Scanner;

public class XAxisNdYAxisHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X-Axis: ");
        int x = sc.nextInt();
        System.out.print("Enter Y-Axis: ");
        int y= sc.nextInt();

        if(x == 0 && y==0) System.out.println("Origin");
        else if(x>0 && y>0) System.out.println("1st Quadrant");
        else if (x<0 && y>0) System.out.println("2nd Quadrant");
        else if(x<0 && y<0) System.out.println("3rd Quadrant");
        else if(x>0 && y<0) System.out.println("4th Quadrant");
        else if(x==0) System.out.println("X-Axis");
        else if(y==0) System.out.println("Y-Axis");






    }
}
