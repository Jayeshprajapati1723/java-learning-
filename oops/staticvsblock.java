class jayesh {
    {
        System.out.println("this is intialization block") ;

    }
    static void st(){
        System.out.println("i am static ") ;
    }
}


public class staticvsblock {
public static void main(String[] args) {
  jayesh j1 = new jayesh() ;
  j1.st();
}    
}
