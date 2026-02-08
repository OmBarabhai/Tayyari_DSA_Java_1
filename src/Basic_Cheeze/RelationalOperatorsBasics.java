package Basic_Cheeze;

public class RelationalOperatorsBasics {

    /*
    Relational Operators:

    >   greater than
    <   less than
    >=  greater than or equal
    <=  less than or equal
    ==  equal to
    !=  not equal to

    Dry Run:
    a = 10, b = 5

    a > b  → true
    a == b → false
    */

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a > b);   // true
        System.out.println(a < b);   // false
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
    }
}
