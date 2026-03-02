package Recursion;

/*
====================================================================
UNIQUE PATHS - FINAL MERGED VERSION (TREE + GRID + STACK + DRY RUN)
Grid: m x n
Allowed Moves: DOWN and RIGHT
Example: m = 3, n = 3
====================================================================

PROBLEM:
Count total unique paths from top-left to bottom-right.

We use REMAINING GRID recursion (not forward movement).

Move Down  -> (m-1, n)
Move Right -> (m, n-1)

WHY?
Because recursion solves smaller subproblems (shrinking grid).

====================================================================
RECURSION FORMULA:
paths(m, n) = paths(m-1, n) + paths(m, n-1)

Down  = paths(m-1, n)
Right = paths(m, n-1)

BASE CASE:
If m == 1 OR n == 1 → return 1
Reason: Only one straight path remains.
====================================================================

GRID VISUAL (3 x 3):

(1,1)  (1,2)  (1,3)
(2,1)  (2,2)  (2,3)
(3,1)  (3,2)  (3,3) ← Destination

Start = Top Left
End   = Bottom Right

====================================================================
PROPER ARROW TREE STRUCTURE (paths(3,3))  ← CLEAN & ALIGNED
====================================================================

paths(3,3)
|
+--> paths(2,3)   [Down - Left Subtree]
|    |
|    +--> paths(1,3) = 1   (Base Case: only right moves left)
|    |
|    +--> paths(2,2)
|         |
|         +--> paths(1,2) = 1   (Base Case)
|         |
|         +--> paths(2,1) = 1   (Base Case)
|         => paths(2,2) = 2
|    => paths(2,3) = 1 + 2 = 3
|
+--> paths(3,2)   [Right - Right Subtree]
     |
     +--> paths(2,2) = 2
     |
     +--> paths(3,1) = 1   (Base Case)
     => paths(3,2) = 2 + 1 = 3

FINAL CALCULATION (Bottom-Up):
paths(3,3) = 3 + 3 = 6

====================================================================
GRID STEP-BY-STEP DRY RUN (VISUAL THINKING)
====================================================================

Step 1: paths(3,3) -> Full Grid
[S  .  .]
[.  .  .]
[.  .  D]

Step 2 (DFS goes Down first):
paths(2,3)

[S  .  .]
[.  .  D]

Step 3:
paths(1,3) -> BASE CASE = 1

Step 4 (Backtrack & go Right):
paths(2,2) = paths(1,2) + paths(2,1) = 1 + 1 = 2

Step 5:
paths(2,3) = 1 + 2 = 3

Step 6:
paths(3,2) = 2 + 1 = 3

Final:
paths(3,3) = 3 + 3 = 6

====================================================================
CALL STACK (LIFO EXECUTION - REAL FLOW)
====================================================================

STACK PUSH (Depth First Search):
paths(3,3)
 → paths(2,3)
   → paths(1,3)  ← FIRST BASE CASE HIT

STACK POP (LIFO - Returning Phase):
paths(1,3) returns 1
paths(2,3) resumes
paths(3,3) resumes

IMPORTANT:
Recursion = STACK (LIFO) + DFS
NOT Queue (FIFO)
Computer executes ONE branch at a time.
====================================================================
*/

public class UniquePathsRecursion {

    // Recursive function with debug prints (tree + stack visualization)
    public static int paths(int m, int n) {

        // STACK PUSH (Function Call - Going Down the Tree)
        System.out.println("CALL  -> paths(" + m + ", " + n + ")");

        // Base Case: Only one row or one column left
        if (m == 1 || n == 1) {
            System.out.println("BASE  -> paths(" + m + ", " + n + ") = 1 (Only one path)");
            return 1;
        }

        /*
        Recursive Breakdown (Tree Branching):
        Left  Subtree = paths(m-1, n)  -> Down Move
        Right Subtree = paths(m, n-1)  -> Right Move

        NOTE:
        We reduce remaining grid size,
        NOT increasing coordinates like (n+1).
        */

        int down = paths(m - 1, n);   // Left branch (Down)
        int right = paths(m, n - 1);  // Right branch (Right)

        int result = down + right;

        // STACK POP (Returning Upward - LIFO)
        System.out.println("RETURN<- paths(" + m + ", " + n + ") = " + result);

        return result;
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        System.out.println("========================================");
        System.out.println("UNIQUE PATHS - FINAL MERGED DRY RUN");
        System.out.println("Grid Size: " + m + " x " + n);
        System.out.println("Moves Allowed: DOWN and RIGHT");
        System.out.println("Execution Style: DFS + STACK (LIFO)");
        System.out.println("========================================\n");

        int totalPaths = paths(m, n);

        System.out.println("\n========================================");
        System.out.println("FINAL ANSWER: Total Unique Paths = " + totalPaths);
        System.out.println("========================================");
    }
}