package OOP;

/*
========================================
FINAL KEYWORD - QUICK REVISION
========================================

Definition:
final is a keyword used to restrict modification.

Uses:
1. final variable → value cannot change
2. final method → cannot be overridden
3. final class → cannot be inherited

Memory Trick:
final variable → constant value
final method → cannot override
final class → cannot inherit
*/

public class Final {

    final static class IronMan {

        final int ARC_REACTOR_POWER = 100;

        final void laserAttack() {
            System.out.println("IronMan fires Unibeam!");
        }

        void showPower() {
            System.out.println("Arc Reactor Power: " + ARC_REACTOR_POWER);
        }
    }

    public static void main(String[] args) {

        IronMan tony = new IronMan();

        tony.showPower();
        tony.laserAttack();

        // tony.ARC_REACTOR_POWER = 200; ❌ Not allowed
    }
}