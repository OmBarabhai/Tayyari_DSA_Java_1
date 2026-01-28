package if_else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP : ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();

        if(sp>cp) {
            System.out.println("Profit is : " + (sp - cp));
            System.out.println("Profit percentage is : " + (double) (sp - cp) / cp * 100);
        }
        if(sp<cp) {
            System.out.println("Loss is : " + (cp - sp));
            System.out.println("Loss percentage is: " + (double) (cp - sp) / cp * 100);
        }
        if(sp == cp) {
            System.out.println("Nor Profit Nor Loss");
        }

    }
}
