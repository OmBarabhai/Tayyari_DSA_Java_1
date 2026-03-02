/*
===============================================================
STAIRCASE PROBLEM (FULL IN-DEPTH RECURSION EXPLANATION)
Input: n = 5
Allowed Jumps: 1 and 2
===============================================================

CORE IDEA:
To reach stair n:
- Last jump could be 1 → came from (n-1)
- Last jump could be 2 → came from (n-2)

Recursive Formula:
ways(n) = ways(n-1) + ways(n-2)

===============================================================
BASE CASES (MOST IMPORTANT)
===============================================================
ways(0) = 1  → One valid way (do nothing, already reached)
ways(n < 0) = 0 → Invalid path

WHY ways(0) = 1 ?
Because reaching exactly the destination counts as ONE successful path.

===============================================================
RECURSION TREE (LOGICAL STRUCTURE) for n = 5
===============================================================

                          ways(5)
                        /         \
                   ways(4)       ways(3)
                  /      \       /      \
             ways(3)  ways(2) ways(2) ways(1)
             /    \      /  \
        ways(2) ways(1) ways(1) ways(0)
         /  \
    ways(1) ways(0)
     /  \
ways(0) ways(-1)

Leaf Nodes:
ways(0) = 1 (valid)
ways(-1) = 0 (invalid)

Final Answer:
ways(5) = 8

===============================================================
IMPORTANT: TREE vs STACK
===============================================================
TREE = Logical (all function calls)
STACK = Actual memory execution (LIFO)

Computer DOES NOT execute full tree at once.
It goes Depth First (one branch at a time).

===============================================================
CALL STACK DRY RUN (LIFO) for ways(3)
===============================================================

Step 1: Call ways(3)
Stack: [ways(3)]

Step 2: Call ways(2)
Stack: [ways(3), ways(2)]

Step 3: Call ways(1)
Stack: [ways(3), ways(2), ways(1)]

Step 4: Call ways(0) → BASE CASE
Stack: [3,2,1,0]
Return 1 → POP (LIFO)

Step 5: ways(1) resumes
Return 1 → POP

Step 6: ways(2) resumes
Return 2 → POP

Step 7: ways(3) resumes
Return 3 → POP

This proves:
Recursion uses STACK (LIFO), NOT Queue (FIFO)
===============================================================
*/

public class StaircaseDeepRecursion {

    // Recursive function for staircase (jumps 1 and 2)
    public static int ways(int n) {

        // Print to visualize CALL STACK (Push phase)
        System.out.println("Calling ways(" + n + ")");

        // Base Case 1: Invalid path
        if (n < 0) {
            System.out.println("ways(" + n + ") = 0 (Invalid, n < 0)");
            return 0;
        }

        // Base Case 2: Reached exactly stair 0
        if (n == 0) {
            System.out.println("ways(0) = 1 (Base Case - Reached Target)");
            return 1;
        }

        // Recursive Calls (Stack grows here - LIFO)
        int left = ways(n - 1);   // Jump 1
        int right = ways(n - 2);  // Jump 2

        int result = left + right;

        // Print to visualize RETURN phase (Pop phase)
        System.out.println("Returning ways(" + n + ") = " + result);

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("====================================");
        System.out.println("STAIRCASE RECURSION ANALYSIS");
        System.out.println("Input n = " + n);
        System.out.println("Allowed jumps = {1, 2}");
        System.out.println("====================================");

        int totalWays = ways(n);

        System.out.println("====================================");
        System.out.println("FINAL ANSWER: Total ways to reach stair " + n + " = " + totalWays);
        System.out.println("====================================");
    }
}