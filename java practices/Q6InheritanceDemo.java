// Q.6 Write a Program to Show Inheritance in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

class Student {
    String name = "JAYESH PRAJAPATI";
    String enrollment = "0873CS241080";
    String section = "B";
}

class CollegeStudent extends Student {

    void display() {
        System.out.println("Enrollment No : " + enrollment);
        System.out.println("Name : " + name);
        System.out.println("Section : " + section);
    }
}

public class Q6InheritanceDemo {
    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();

        System.out.println("INHERITANCE IN JAVA");
   

        s.display();
    }
}