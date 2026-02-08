package Basic_Cheeze;

public class LogicalOperators {

    /*
    Logical Operators:

    &&  (AND) → true if both conditions are true
    ||  (OR)  → true if any one condition is true
    !   (NOT) → reverses the result

    Dry Run:
    a = 10, b = 5

    a > 5 && b < 10  → true
    a < 5 || b < 10  → true
    !(a > b)         → false
    */

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a > 5 && b < 10); // true
        System.out.println(a < 5 || b < 10); // true
        System.out.println(!(a > b));        // false
    }
}
