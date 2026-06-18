//static variable used for common data and it is saves storage and enhance the optimization 
class clg {
static String uname ="RGPV" ;
String name ;
int roll ;

void show() {
System.out.println("name is : "+ name +" -" + "roll no : " + roll + " from  " +  uname) ;
}

}







public class staticconcept {
public static void main (String args[]) {
System.out.println(clg.uname) ;//class name se hm call kr skte h static variable ko 

clg s1 = new clg() ;
s1.name = "jayesh" ;
s1.roll = 80 ;
    s1.show();
clg s2 = new clg() ;
s2.name = "raman" ;
s2.roll = 90 ;
s2.show();
}
    
}
