package OOP;
// Topic: Passing Objects, Shallow Copy, and Deep Copy in Java

public class PassingObjects{

    // ----------------------------
    // Car class (Blueprint)
    // ----------------------------
    static class Car {
        String type;
        int seats;
        double fuelCapacity;
    }


    public static void main(String[] args) {

        // ----------------------------
        // 1. Create Object
        // ----------------------------
        Car c = new Car();
        c.type = "SUV";
        c.seats = 5;
        c.fuelCapacity = 8.9;

        System.out.println("---- ORIGINAL OBJECT ----");
        printCar(c);


        // ----------------------------
        // 2. Passing Object to Method
        // ----------------------------
        changeCar(c);

        System.out.println("---- AFTER FUNCTION CALL (OBJECT MODIFIED) ----");
        printCar(c);


        // ----------------------------
        // 3. Reassigning Object Inside Method
        // ----------------------------
        reassignObject(c);

        System.out.println("---- AFTER REASSIGN FUNCTION (NO CHANGE) ----");
        printCar(c);


        // ----------------------------
        // 4. Shallow Copy Example
        // ----------------------------
        Car shallowCopy = c;

        shallowCopy.seats = 10;

        System.out.println("---- SHALLOW COPY CHANGE ----");
        System.out.println("Original seats: " + c.seats);
        System.out.println("Copy seats: " + shallowCopy.seats);


        // ----------------------------
        // 5. Deep Copy Example
        // ----------------------------
        Car deepCopy = new Car();
        deepCopy.type = c.type;
        deepCopy.seats = c.seats;
        deepCopy.fuelCapacity = c.fuelCapacity;

        deepCopy.seats = 2;

        System.out.println("---- DEEP COPY CHANGE ----");
        System.out.println("Original seats: " + c.seats);
        System.out.println("Deep Copy seats: " + deepCopy.seats);

    }


    // -------------------------------------------------
    // Method 1: Modifies object fields
    // Both references point to same object
    // -------------------------------------------------
    static void changeCar(Car x) {
        x.seats = 4;
        x.type = "Jeep";
        x.fuelCapacity = 9;
    }


    // -------------------------------------------------
    // Method 2: Creates new object inside method
    // Original object remains unchanged
    // -------------------------------------------------
    static void reassignObject(Car x) {
        x = new Car();
        x.seats = 12;
        x.type = "Truck";
        x.fuelCapacity = 20;
    }


    // -------------------------------------------------
    // Helper method to print object data
    // -------------------------------------------------
    static void printCar(Car c) {
        System.out.println("Type: " + c.type);
        System.out.println("Seats: " + c.seats);
        System.out.println("Fuel Capacity: " + c.fuelCapacity);
        System.out.println();
    }
}