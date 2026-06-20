// Q.3 Write a Program to Show Concept of CLASS in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

class Student {
    String name;
    String enrollment;
    String section;

    void display() {
        System.out.println("Enrollment No : " + enrollment);
        System.out.println("Name : " + name);
        System.out.println("Section : " + section);
    }
}

public class q3ClassDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "JAYESH PRAJAPATI";
        s1.enrollment = "0873CS241080";
        s1.section = "B";

        System.out.println("CONCEPT OF CLASS IN JAVA");
        System.out.println("------------------------");

        s1.display();
    }
}