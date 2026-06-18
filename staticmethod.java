class clg {
static String uname ="RGPV" ;
String name ;
int roll ;

static void rename(String rename) {
uname =rename ;
}

void show() {
System.out.println("name is : "+ name +" -" + "roll no : " + roll + " from  " +  uname) ;
}

}


public class staticmethod {
    public static void main (String args[])
 {
clg s1 = new clg() ;
s1.name = "jayesh" ;
s1.roll = 80 ;
    s1.show();



clg s2 = new clg() ;
s2.name = "raman" ;
s2.roll = 90 ;
s2.show();

clg.rename("jspuniversity"); //change now
s1.show();
s2.show(); 



 }    
}
