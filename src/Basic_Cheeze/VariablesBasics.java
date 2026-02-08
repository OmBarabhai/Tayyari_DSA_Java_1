package Basic_Cheeze;

public class VariablesBasics {

    /*
    📌 Topic: Variables Basics

    🧠 Theory (Short):
    - A variable is used to store data.
    - The value of a variable can be changed during program execution.
    - Java allows performing arithmetic operations on variables.

    🎯 Why this example?
    - Shows how a single variable can be updated step by step
    - Helps understand reassignment of variables

    📘 Dry Run:
    Step 1: x = 5          → prints 5
    Step 2: x = x - 2      → 5 - 2 = 3   → prints 3
    Step 3: x = x * 8      → 3 * 8 = 24  → prints 24
    Step 4: x = x - 50     → 24 - 50 = -26 → prints -26
    Step 5: x = x / 25     → -26 / 25 = -1 (integer division) → prints -1

    📦 Output:
    5
    3
    24
    -26
    -1
    */

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        x = x - 2;
        System.out.println(x);

        x = x * 8;
        System.out.println(x);

        x = x - 50;
        System.out.println(x);

        x = x / 25;
        System.out.println(x);
    }
}
