package Basic_Cheeze;

public class FinalKeyword {

    /*
    final keyword:

    - Used to make a variable constant
    - Value cannot be changed

    Dry Run:
    final int x = 10
    x = 20  ❌ (not allowed)
    */

    public static void main(String[] args) {

        final int x = 10;
        System.out.println(x);

        // x = 20;  // error: cannot change final variable
    }
}
