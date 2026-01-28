package if_else;

import java.util.Scanner;

public class HWRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();

        int Area = l*b;
        int Perimeter= 2*(l+b);


        if(Area > Perimeter){
            System.out.println("Area is Greater than Perimeter");
        }
        else System.out.println("Area is Not Greater than perimeter");

    }
}
