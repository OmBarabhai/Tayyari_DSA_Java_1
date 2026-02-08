package Basic_Cheeze;

public class TypeCastingBasics {

    /*
    Type Casting:

    Implicit casting:
    int → double (automatic)

    Explicit casting:
    double → int (manual)

    Dry Run:
    int a = 10
    double b = a        → 10.0

    double x = 12.7
    int y = (int) x     → 12
    */

    public static void main(String[] args) {

        // Implicit casting
        int a = 10;
        double b = a;
        System.out.println(b);   // 10.0

        // Explicit casting
        double x = 12.7;
        int y = (int) x;
        System.out.println(y);   // 12
    }
}
