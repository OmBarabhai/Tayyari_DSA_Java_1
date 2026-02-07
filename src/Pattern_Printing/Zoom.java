package Pattern_Printing;

import java.util.Scanner;

public class Zoom {
    public static void main(String[] args) {

        // Take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Example: n = 4

        // Total rows and columns = 2*n - 1 = 7
        for (int i = 1; i <= 2 * n - 1; i++) {

            for (int j = 1; j <= 2 * n - 1; j++) {

                int a = i;  // row index
                int b = j;  // column index

                // Mirror row index after center
                if (i > n)
                    a = 2 * n - i;

                // Mirror column index after center
                if (j > n)
                    b = 2 * n - j;

                // Print minimum distance from edge
                System.out.print(Math.min(a, b) + " ");
            }

            System.out.println();
        }
    }
}

/*
---------------- DRY RUN (Very Simple) ----------------

Input:
n = 4

Grid size = 2*n - 1 = 7 x 7

Example cell: i = 6, j = 5

Step 1:
a = i = 6
b = j = 5

Step 2 (mirror logic):
i > n → 6 > 4 → a = 8 - 6 = 2
j > n → 5 > 4 → b = 8 - 5 = 3

Step 3:
min(a, b) = min(2, 3) = 2

So value printed at (6,5) = 2

Edge case:
i = 1, j = 7
a = 1
b = 8 - 7 = 1
min(1,1) = 1

-------------------------------------------------------

Logic Rule:
Value at (i, j) =
min( min(i, 2*n - i), min(j, 2*n - j) )

-------------------------------------------------------
*/
