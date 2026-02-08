package if_else;

import java.util.Scanner;

public class HWRectangle {

    /*
    Compare area and perimeter of a rectangle.

    Formula:
    Area      = length × breadth
    Perimeter = 2 × (length + breadth)

    -------- DRY RUN --------
    Input:
    length = 5
    breadth = 3

    Area = 5 × 3 = 15
    Perimeter = 2 × (5 + 3) = 16

    15 > 16 → false
    Output: Area is Not Greater than Perimeter
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();   // length
        int b = sc.nextInt();   // breadth

        int area = l * b;
        int perimeter = 2 * (l + b);

        if (area > perimeter) {
            System.out.println("Area is Greater than Perimeter");
        } else {
            System.out.println("Area is Not Greater than Perimeter");
        }

        sc.close();
    }
}
