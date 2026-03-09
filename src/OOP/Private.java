package OOP;
// Encapsulation = Hide data using private and access it using getters and setters.
class Student {

    // Encapsulation: data is hidden using private variables
    private String name;
    private int rollNo;
    private double cgpa;

    // Getter → used to read the private data
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Setter → used to modify the private data
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void printDetails() {
        System.out.println(name + " " + rollNo + " " + cgpa);
    }
}

public class Private {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Accessing data through setters (not directly)
        s1.setName("Rahul");
        s1.setRollNo(70);
        s1.setCgpa(8.5);

        // Accessing data through getters
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        System.out.println(s1.getCgpa());
    }
}