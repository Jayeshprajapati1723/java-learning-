// Q.5 Write a Program to Show How Exception Handling is in JAVA
// Enrollment No: 0873CS241080
// Name: JAYESH PRAJAPATI
// Section: B

public class Q5ExceptionHandlingDemo {
    public static void main(String[] args) {

        System.out.println("Enrollment No : 0873CS241080");
        System.out.println("Name : JAYESH PRAJAPATI");
        System.out.println("Section : B");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by Zero is Not Allowed.");
        }
        finally {
            System.out.println("Finally Block Executed.");
        }

        System.out.println("Program Continues After Exception Handling.");
    }
}