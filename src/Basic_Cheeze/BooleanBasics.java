package Basic_Cheeze;

import java.util.Scanner;

public class BooleanBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask how many values
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Create boolean array
        boolean[] flag = new boolean[n];

        // Take input (1 for true, 0 for false)
        System.out.println("Enter 1 for true and 0 for false:");

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            if (number == 1) {
                flag[i] = true;
            } else {
                flag[i] = false;
            }
        }

        // Print values
        System.out.println("Stored boolean values:");

        for (int i = 0; i < n; i++) {
            System.out.println(flag[i]);
        }

        sc.close();
    }
}
