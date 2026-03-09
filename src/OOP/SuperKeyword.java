package OOP;
/*
super keyword

Definition: super refers to the parent class object.

3 Important Uses

1️⃣ Call parent constructor

super();

2️⃣ Access parent variable

super.name

3️⃣ Call parent method

super.show();
Output
Parent Constructor Called
Child Constructor Called

Parent name: Parent
Child name: Child

Method from Parent Class
*/
public class SuperKeyword {

    // Parent Class
    static class Person {

        String name = "Parent";

        /*
        Parent Constructor
        Intuition: When a child object is created,
        the parent constructor is called first.
        */
        Person() {
            System.out.println("Parent Constructor Called");
        }

        void show() {
            System.out.println("Method from Parent Class");
        }
    }

    // Child Class
    static class Student extends Person {

        String name = "Child";

        /*
        super() Constructor Call
        Definition: super() calls the parent class constructor.
        Intuition: Used when child object needs parent initialization.
        */
        Student() {
            super(); // calls Person constructor
            System.out.println("Child Constructor Called");
        }

        void display() {

            /*
            super.variable
            Definition: Access parent class variable.
            */
            System.out.println("Parent name: " + super.name);

            /*
            this.variable
            Access current class variable.
            */
            System.out.println("Child name: " + this.name);

            /*
            super.method()
            Definition: Calls parent class method.
            */
            super.show();
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println();

        s1.display();
    }
}