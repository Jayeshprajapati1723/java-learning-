// Q.8 Write a Program to Show Access Specifiers (Public, Private, Protected) in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

class AccessDemo {

    // Public Variable
    public int publicVar = 10;

    // Private Variable
    private int privateVar = 20;

    // Protected Variable
    protected int protectedVar = 30;


    public void displayPrivate() {
        System.out.println("Private Variable = " + privateVar);
    }
}

public class Q8AccessSpecifiersDemo {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");

        System.out.println("\nACCESS SPECIFIERS IN JAVA");
        System.out.println("-------------------------");

        // Accessing Public Variable
        System.out.println("Public Variable = " + obj.publicVar);

        // Accessing Private Variable using method
        obj.displayPrivate();

        // Accessing Protected Variable
        System.out.println("Protected Variable = " + obj.protectedVar);
    }
}