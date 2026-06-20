/*  fee. 2. Electricity Bill System
An electricity company calculates monthly bills. Create a class ElectricityBill with private variables:
customerName
unitsConsumed
pricePerUnit
Using getters calculate total bill:
totalBill = unitsConsumed * pricePerUnit
If units > 500 add 10% surcharge. */
class Ebill {
    private String customerName;
    private float unitsConsumed;
    private static float pricePerUnit = 5;
    private float surcharge;

    void setcname() {
        System.out.println("enter your name here ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String n = sc.next();
        customerName = n;
    }

    private float totalbill;

    void setunit() {
        System.out.println("enter your unit  ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        float u = sc.nextInt();
        unitsConsumed = u;
    }

    void getbil() {
        totalbill = unitsConsumed * pricePerUnit;
        if (unitsConsumed > 500) {
            totalbill = unitsConsumed * pricePerUnit + (totalbill * 10 / 100);

        }

    }

    void show() {
        System.out.println("welcome to electricity department");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Unit of Month : " + unitsConsumed);
        System.out.println("Monthly bill in Rs : " + totalbill);

    }
}

public class s1clsassqsn2 {
    public static void main(String[] args) {
        Ebill c1 = new Ebill();
        c1.setcname();
        c1.setunit();
        c1.getbil();
        c1.show();

    }

}
/*enter your name here 
goivnd
enter your unit  
1522
welcome to electricity department
Customer Name : goivnd
Unit of Month : 1522.0
Monthly bill in Rs : 8371.0 */
