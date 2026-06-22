class a {
    int x = 10 ;
    int y = 5 ;
}
class b extends a {
    int y = 20 ;
}

public class inheritance {
public static void main(String[] args) {
    a a1 = new a() ;
    b b1 = new b() ;
System.out.println(b1.x) ;
System.out.println(b1.x) ;
System.out.println(b1.y) ;
System.out.println(a1.x) ;
}
}