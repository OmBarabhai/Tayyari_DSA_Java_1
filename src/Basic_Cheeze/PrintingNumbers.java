package Basic_Cheeze;

public class PrintingNumbers {

    /*
    Printing numbers vs strings:

    - + operator behavior:
      number + number → addition
      string + anything → concatenation

    Dry Run:
    69 + 1     → 70
    "69+1"     → printed as text
    */

    public static void main(String[] args) {

        // Number addition
        System.out.println(69 + 1);    // 70

        // String printing
        System.out.println("69+1");    // 69+1
    }
}
