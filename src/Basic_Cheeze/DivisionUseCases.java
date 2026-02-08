package Basic_Cheeze;

public class DivisionUseCases {

    /*
    =================================================
    📌 Topic: Division ( / ) Operator – DSA Revision
    =================================================

    🧠 What is Division?
    - Division tells how many equal parts can be made.
    - It gives the QUOTIENT.

    =================================================
    🔢 DIVISION CASES (Java)
    =================================================
    1️⃣ int / int       → int result (decimal lost)
    2️⃣ double / int    → double result
    3️⃣ int / double    → double result
    4️⃣ double / double → double result

    =================================================
    🔢 DIVISION RULES (IMPORTANT)
    =================================================
    ✔ int / int → integer division (decimal lost)
    ✔ If ANY operand is double → decimal result
    ✔ Java auto-promotes int → double

    =================================================
    🧩 PROBLEM 1: Split Chocolates
    =================================================
    You have 100 chocolates.
    You divide them among 30 students.

    Visualization:
    Chocolates → shared equally

    Dry Run:
    100 / 30 = 3.33 → int division → 3

    =================================================
    🧩 PROBLEM 2: Average Marks (DSA)
    =================================================
    Marks = [20, 30, 40, 50]

    Visualization:
    Total marks divided by number of subjects

    Dry Run:
    sum = 140
    count = 4
    avg = 140 / 4 = 35

    =================================================
    🧩 PROBLEM 3: Binary Search MID (PROPER DSA)
    =================================================
    Array (sorted):
    index:  0  1  2  3  4
    value: [2, 4, 6, 8, 10]

    Target = 6

    Visualization:
    Always check the middle element

    Dry Run:
    low = 0
    high = 4

    mid = (low + high) / 2
        = (0 + 4) / 2
        = 2

    arr[mid] = 6 → target found

    =================================================
    🧠 KEY IDEA (VERY IMPORTANT)
    =================================================
    Division is used when you want:
    👉 equal sharing
    👉 average
    👉 middle index (Binary Search)
    */

    public static void main(String[] args) {

        // ===== Problem 1: Integer division =====
        System.out.println(100 / 30);   // 3

        // ===== Problem 2: Average =====
        int[] marks = {20, 30, 40, 50};
        int sum = 0;

        for (int m : marks) {
            sum += m;
        }

        double avg = (double) sum / marks.length;
        System.out.println(avg);        // 35.0

        // ===== Problem 3: Binary Search MID =====
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;

        int low = 0;
        int high = arr.length - 1;

        int mid = (low + high) / 2;
        System.out.println("Mid index: " + mid);
        System.out.println("Mid value: " + arr[mid]);
    }
}
