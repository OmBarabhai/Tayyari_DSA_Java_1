package if_else;

import java.util.Scanner;

public class ProfitLoss {

    /*
    Profit and Loss calculation.

    Rule:
    - If SP > CP → Profit
    - If SP < CP → Loss
    - If SP == CP → No Profit No Loss

    Profit / Loss % formula:
    percentage = (difference / CP) * 100

    Dry Run:
    CP = 100, SP = 120
    Profit = 120 - 100 = 20
    Profit % = (20 / 100) * 100 = 20%

    CP = 100, SP = 80
    Loss = 100 - 80 = 20
    Loss % = (20 / 100) * 100 = 20%
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cp = sc.nextInt();   // cost price
        int sp = sc.nextInt();   // selling price

        if (sp > cp) {
            System.out.println("Profit is : " + (sp - cp));
            System.out.println("Profit percentage is : " + (double)(sp - cp) / cp * 100);
        }
        else if (sp < cp) {
            System.out.println("Loss is : " + (cp - sp));
            System.out.println("Loss percentage is : " + (double)(cp - sp) / cp * 100);
        }
        else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
