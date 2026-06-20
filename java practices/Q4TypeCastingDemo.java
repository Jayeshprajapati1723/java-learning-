// Q.4 Write a Program to Show Type Casting in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

public class Q4TypeCastingDemo {
    public static void main(String[] args) {

        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");

        // Implicit Type Casting (Widening)
        int num = 100;
        double d = num;

        System.out.println("\nImplicit Type Casting");
        System.out.println("Integer Value = " + num);
        System.out.println("Converted Double Value = " + d);

        // Explicit Type Casting (Narrowing)
        double value = 99.99;
        int i = (int) value;

        System.out.println("\nExplicit Type Casting");
        System.out.println("Double Value = " + value);
        System.out.println("Converted Integer Value = " + i);
    }
}