package OOP;

import java.util.Scanner;

public class UserDefinedDataType{
    public static class Student{
        String name;
        int rollNo;
        double cgpa;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
//        s.name = "Om";
//        s.cgpa = 8.68;
//        s.rollNo = 24;
        System.out.print("Name: ");
        s.name = sc.next();
        System.out.print("CGPA: ");
        s.cgpa = sc.nextDouble();
        System.out.print("Roll NO: ");

        s.rollNo = sc.nextInt();

        System.out.println("Student name: "+s.name+"\n"+"CGPA is: "+s.cgpa+"\n"+"Roll N0: "+s.rollNo);
    }
}
