package if_else;

import java.util.Scanner;

public class XAxisNdYAxisHW {

    /*
    Coordinate Plane Visualization (Graph):

                     Y-axis
                       ^
                       |
              Q2       |        Q1
           (-,+)       |      (+,+)
                       |
      <----------------+-----------------> X-axis
                       |
              Q3       |        Q4
           (-,-)       |      (+,-)
                       |
                       v

    Special Points:
    - Origin  → (0, 0)
    - X-axis  → y = 0
    - Y-axis  → x = 0

    ---------------- DRY RUNS ----------------

    Example 1:
    x = 0, y = 0
    → Origin

    Example 2:
    x = 3, y = 4
    → Q1 (1st Quadrant)

    Example 3:
    x = -2, y = 5
    → Q2 (2nd Quadrant)

    Example 4:
    x = -3, y = -6
    → Q3 (3rd Quadrant)

    Example 5:
    x = 5, y = -2
    → Q4 (4th Quadrant)

    Example 6:
    x = 0, y = 7
    → Y-axis

    Example 7:
    x = 6, y = 0
    → X-axis
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();   // x-coordinate
        int y = sc.nextInt();   // y-coordinate

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        }
        else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        }
        else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        }
        else if (x == 0) {
            System.out.println("Y-axis");
        }
        else {
            System.out.println("X-axis");
        }

        sc.close();
    }
}
