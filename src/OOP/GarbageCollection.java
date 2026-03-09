package OOP;

import java.lang.ref.Cleaner;

public class GarbageCollection {

    static class Hulk {

        // Cleaner instance
        private static final Cleaner cleaner = Cleaner.create();

        // Cleanup task
        static class CleanTask implements Runnable {
            public void run() {
                System.out.println("Hulk object cleaned by Cleaner API");
            }
        }

        // Register cleanup
        private final Cleaner.Cleanable cleanable;

        Hulk() {
            cleanable = cleaner.register(this, new CleanTask());
        }
    }

    public static void main(String[] args) {

        Hulk h = new Hulk();

        h = null;

        System.gc();

        System.out.println("End of program");
    }
}