package OOP;

public class CreateFunInClassAndCallOutsideClass {
    public static class Car{
        String type;
        int seats;
        double fuelCapacity;

        void print(){
            System.out.println("Type: " + type);
            System.out.println("Seats: " + seats);
            System.out.println("Fuel Capacity: " + fuelCapacity);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.fuelCapacity = 8.8;
        c.seats = 5;
        c.type = "XUV";
        c.print();
    }
}
