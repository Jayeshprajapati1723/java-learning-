// Q.10 Write a Program to Show Interfacing Between Two Classes in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

interface StudentInfo {

    void display();
}


class Student implements StudentInfo {

    public void display() {

        System.out.println("INTERFACE IN JAVA");
        System.out.println("-----------------");
        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");
    }
}


public class Q10InterfaceDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}