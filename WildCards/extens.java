//comments are provided for reference,they were generated by gpt

import java.io.*;
import java.util.*;

// The Student class
class Student implements Serializable {

    int rollno;
    String name;
    int age;

    // Constructor for Student
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // Method to serialize the ArrayList of Students (or subclasses)
    static void serialize(ArrayList<? extends Student> al, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al); // Writing the ArrayList to a file
            oos.close();
            fos.close();
            System.out.println("Data serialized successfully to " + filename);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// The engStudent class, extending Student and implementing Serializable
class engStudent extends Student implements Serializable {

    String branch;

    // Constructor for engStudent
    engStudent(int rollno, String name, int age, String branch) {
        super(rollno, name, age);
        this.branch = branch;
    }
}

// Main class to execute serialization with user input
public class extens {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ArrayList of Student
        ArrayList<Student> al = new ArrayList<Student>();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Taking user input for Student objects
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            al.add(new Student(rollno, name, age));
        }

        // Serialize Student ArrayList to "student.ser"
        Student.serialize(al, "student.ser");

        // ArrayList of engStudent
        ArrayList<engStudent> al1 = new ArrayList<engStudent>();
        System.out.print("\nEnter the number of engineering students: ");
        int m = sc.nextInt();

        // Taking user input for engStudent objects
        for (int i = 0; i < m; i++) {
            System.out.println(
                "Enter details for Engineering Student " + (i + 1) + ":"
            );
            System.out.print("Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Branch: ");
            String branch = sc.nextLine();
            al1.add(new engStudent(rollno, name, age, branch));
        }

        // Serialize engStudent ArrayList to "engstudent.ser"
        Student.serialize(al1, "engstudent.ser");

        sc.close();
    }
}
