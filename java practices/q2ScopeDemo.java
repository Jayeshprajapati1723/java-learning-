// Q.2 Write a Program to Show Scope of Variables in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

public class q2ScopeDemo {

    // Instance Variable (Global Variable)
    int instanceVar = 100;

    public void display() {

        // Local Variable
        int localVar = 50;

        System.out.println("Enrollment No: 0873CS241080");
        System.out.println("Name: JAYESH PRAJAPATI");
        System.out.println("Section: B");

        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Local Variable = " + localVar);

        // Block Scope Variable
        {
            int blockVar = 25;
            System.out.println("Block Variable = " + blockVar);
        }
    }

    public static void main(String[] args) {

        q2ScopeDemo obj = new q2ScopeDemo();

        obj.display();

        // Main Method Variable
        int mainVar = 200;
        System.out.println("Main Method Variable = " + mainVar);
    }
}