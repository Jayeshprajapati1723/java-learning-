// Q.7 Write a Program to Show Polymorphism in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

class Student {

    void display() {
        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");
    }
}

class CollegeStudent extends Student {

    @Override
    void display() {
        System.out.println("POLYMORPHISM IN JAVA");
        System.out.println("--------------------");
        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");
    }
}

public class Q7PolymorphismDemo {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Student s = new CollegeStudent();

        s.display();
    }
}