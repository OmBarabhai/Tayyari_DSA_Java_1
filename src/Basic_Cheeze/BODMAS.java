package Basic_Cheeze;

public class BODMAS {

    /*
    BODMAS order:
    Brackets → Division/Multiplication → Addition/Subtraction

    Dry Run 1:
    (4 * 2) / 3
    = 8 / 3
    = 2.66

    Dry Run 2:
    4 + 6 * 2
    = 4 + 12
    = 16
    */

    public static void main(String[] args) {

        double result1 = (double) (4 * 2) / 3;
        System.out.println(result1);

        int result2 = 4 + 6 * 2;
        System.out.println(result2);
    }
}
