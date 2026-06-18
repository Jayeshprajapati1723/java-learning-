//class and object 

class student {
    int roll ;
    String name ; 
    int std ;
    void input (int r ,String n ,int s) {
        roll = r ; 
        name = n ;
        std = s ;
    }


    void show () {
        System.out.println(name+" " +roll+" "+ std) ;
    }
}


public class oops1 {
public static void main(String args[]) {
student s1 = new student() ;
s1.input(10, "jayesh", 100);
s1.show(); 

student s2 = new student() ;
s2.input(10, "aman", 100);
s2.show(); 

student s3 = new student() ;
s3.input(11, "raj", 102);
s3.show(); 
}
    
}
