package OOP;

/*
========================================
EXCEPTION HANDLING - QUICK REVISION
========================================

Exception

Definition:
An error that occurs during program execution
and interrupts normal program flow.

Example:
int x = 10 / 0;

Exception Handling Structure

try {
}
catch(Exception e) {
}
finally {
}

throw
Definition:
Used to manually throw an exception.

throws
Definition:
Used to declare an exception in method signature.

Memory Trick:
try → risky code
catch → handle error
finally → always executes
throw → create exception
throws → declare exception
*/

public class ExceptionHandling {

    static void checkAge(int age) {

        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {

            int x = 10 / 0;

        } catch (Exception e) {

            System.out.println("Exception caught: " + e);

        } finally {

            System.out.println("Finally block executed");
        }

        checkAge(16);
    }
}