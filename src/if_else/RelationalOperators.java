package if_else;

public class RelationalOperators {

    /*
    Relational Operators with if–else:

    Operators:
    >   greater than
    <   less than
    >=  greater than or equal
    <=  less than or equal
    ==  equal to
    !=  not equal to

    -------- DRY RUNS --------

    Example 1:
    a = 10, b = 5
    a > b → true
    Output: a is greater

    Example 2:
    a = 5, b = 5
    a == b → true
    Output: a and b are equal

    Example 3:
    a = 3, b = 7
    a < b → true
    Output: a is smaller
    */

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        /*
        int a = 10;
        int b = 5;

        System.out.println(a > b);    // true
        System.out.println(a < b);    // false
        System.out.println(a == b);   // false
        System.out.println(a != b);   // true
        System.out.println(a >= b);   // true
        System.out.println(a <= b);   // false

        */

        // Example 1: greater than
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Example 2: equal to
        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }

        // Example 3: less than
        if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is not smaller than b");
        }
    }
}
