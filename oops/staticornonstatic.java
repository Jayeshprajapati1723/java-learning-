class Statics{

static void show() {
    System.out.println("i am static") ;
}




}
public class staticornonstatic {
    public static void main(String[] args) {
        System.out.println("helo");
        Statics obj1 = new Statics() ;
      Statics.show() ;
    }
}
