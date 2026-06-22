class aa {
aa() {
    System.out.println("hello jayesh from aa") ;
}
}
class bb extends aa{
bb() {
    super(); //use for change the constructor of parent class
    System.out.println("hello jayesh from bb") ;
}
}

public class thissuper {
    public static void main(String[] args) {
        bb b1 = new bb() ;
        System.out.println("b1"+b1);//address
    }
    
}
