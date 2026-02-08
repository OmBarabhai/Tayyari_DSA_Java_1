package Basic_Cheeze;

public class IncrementDecrement {

    /*
    Increment / Decrement:

    Post-decrement (x--):
    - use value first
    - then decrease

    Post-increment (x++):
    - use value first
    - then increase

    Pre-decrement (--y):
    - decrease first
    - then use value

    Dry Run:
    x = 10
    y = x--  → y = 10, x = 9

    print x        → 9
    print x++      → 9 (then x becomes 10)
    print x        → 10

    y = 10
    --y            → 9

    100.0 / 30.0   → 3.3333
    */

    public static void main(String[] args) {

        int x = 10, y = x--;

        System.out.println(x);      // 9
        System.out.println(x++);    // 9
        System.out.println(x);      // 10

        System.out.println("y: " + y);      // 10
        System.out.println("--y: " + --y);  // 9

        System.out.println("y-- after y: " + y);

        double a = 100.0 / 30.0;
        System.out.println(0 + a);
    }
}
