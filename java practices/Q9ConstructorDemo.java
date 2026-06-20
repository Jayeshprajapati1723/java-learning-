// Q.9 Write a Program to Show Use and Advantages of CONSTRUCTOR in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

class Student {

    String name;
    String enrollment;
    String section;


    // Constructor
    Student() {
        name = "JAYESH PRAJAPATI";
        enrollment = "0873CS241080";
        section = "B";
    }


    void display() {

        System.out.println("Enrollment No : " + enrollment);
        System.out.println("Name : " + name);
        System.out.println("Section : " + section);
    }
}


public class Q9ConstructorDemo {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("CONSTRUCTOR IN JAVA");
        System.out.println("------------------");

        s.display();
    }
}