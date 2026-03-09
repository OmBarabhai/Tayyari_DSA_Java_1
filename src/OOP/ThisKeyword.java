package OOP;
/*

this = reference to the current object.
--------------------------------------
Example:

this.name = name;

------------------------------------------
Meaning:
------------------------------------------
(this.name):
left name → object variable
------------------------------------------
(name):
right name → parameter
------------------------------------------
4 Important Uses of this
------------------------------------------
1. Refer current class instance variables

2. Call current class constructor → this()

3. Pass current object as argument

4. Return current object from method
------------------------------------------

* */
public class ThisKeyword {

    static class Student {

        String name;
        int rollNo;
        double cgpa;

        /*
        this Keyword
        Definition: 'this' is a reference variable that refers to the current object.

        Intuition:
        When a parameter name is the same as the instance variable,
        'this' helps distinguish the object variable from the method parameter.
        */

        Student(String name, int rollNo, double cgpa) {
            this.name = name;     // this.name → instance variable
            this.rollNo = rollNo; // rollNo → parameter
            this.cgpa = cgpa;
        }

        /*
        this() - Constructor Chaining
        Definition: Used to call another constructor of the same class.

        Rule: this() must be the first statement inside the constructor.
        */
        Student() {
            this("Unknown", 0, 0.0);
        }

        void display() {
            System.out.println("Name: " + this.name +
                    " RollNo: " + this.rollNo +
                    " CGPA: " + this.cgpa);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101, 8.5);
        s1.display();

        Student s2 = new Student();
        s2.display();
    }
}