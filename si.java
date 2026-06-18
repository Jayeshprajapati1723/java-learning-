//eclipse m kran h
public class si {
    public static void main (String args[]) {
//write a program simple intrest and all the values given by user 
 java.util.Scanner sc = new java.util.Scanner(System.in) ;
System.out.println("enter the principle p ") ;
int p  = sc.nextInt() ;
System.out.println("enter the rate ") ;
int r = sc.nextInt() ;
System.out.println("enrer the time ") ;
int t = sc.nextInt() ;
 int sir = (p*r*t)/100 ;
System.out.println("hello your si is here p*r*t/100 ="+sir) ;
    }
}