package Basic_Cheeze;
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), r= sc.nextInt(), t = sc.nextInt();
        double si = p*r*t/100.0;
        System.out.println(si);
    }
}
