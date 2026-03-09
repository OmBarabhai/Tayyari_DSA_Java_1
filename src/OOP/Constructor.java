package OOP;
/*

Constructor: special method used to initialize objects.

Default constructor: object created with default values.

Parameterized constructor: object created with given values.

Constructor overloading: multiple constructors with different parameters.

Copy constructor: duplicate another object's data.

Constructor chaining: calling another constructor using this().

*/
public class Constructor {

    static class Student {

        String name;
        int rollNo;
        double cgpa;

        /*
        Default Constructor
        Definition: A constructor with no parameters.
        Intuition: Creates an object with default values.
        */
        Student() {
            this("Unknown", 0, 0.0);   // Constructor chaining
        }

        /*
        Parameterized Constructor
        Definition: A constructor that accepts parameters.
        Intuition: Used to initialize object with specific values at creation.
        */
        Student(String name, int rollNo, double cgpa) {
            this.name = name;
            this.rollNo = rollNo;
            this.cgpa = cgpa;
        }

        /*
        Constructor Overloading
        Definition: Multiple constructors in the same class with different parameter lists.
        Intuition: Allows creating objects in multiple ways.
        */
        Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
            this.cgpa = 0.0;
        }

        /*
        Copy Constructor
        Definition: A constructor that creates a new object by copying another object.
        Intuition: Used to duplicate an object's data.
        */
        Student(Student s) {
            this.name = s.name;
            this.rollNo = s.rollNo;
            this.cgpa = s.cgpa;
        }

        void display() {
            System.out.println("Name: " + name +
                    " RollNo: " + rollNo +
                    " CGPA: " + cgpa);
        }
    }

    public static void main(String[] args) {

        // Default constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized constructor
        Student s2 = new Student("Rahul", 101, 8.5);
        s2.display();

        // Constructor overloading
        Student s3 = new Student("Ankit", 102);
        s3.display();

        // Copy constructor
        Student s4 = new Student(s2);
        s4.display();
    }
}