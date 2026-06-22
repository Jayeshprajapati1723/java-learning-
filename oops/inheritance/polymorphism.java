class j {
   void add(int a ,int b ) {
System.out.println("a+b = "+(a+b)) ;
    }

       void add(int a ,int b,int c ) {
System.out.println("a+b = "+(a+b+c)) ;
    }

}


public class polymorphism {
public static void main(String[] args) {
j j1 = new j() ;
j1.add(5,6) ;
j1.add(5, 10, 20);
}    
}
