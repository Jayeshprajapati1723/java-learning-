//interface 
//it is a hundred percent abstract class by default 
//interface ek extra benefit deta  h
//multiple inheritance allow ho ggya interface se 

//keyword interface name k keywrod 

//interface m body nhi ho skta h 
//phle class inherit fir impleent of interface 
//constructor nhi h 
//kyo nhi rkha constructor 
//isme static h isliye objec
//in java 8 version body bhi diya gya h special default mehtod or static method 

//in java 9 private mehtod introduce in interface 

//default method : it is by deffault or its child all its child static mehtod it is not inheriteed to child it is a utility method 
//it can be only be called via interface name 

//final keyword final class = a class that can not be inherited 
//final method : a method that can not be overidden in its child class 
//final variable : a variable whose value can not be changed 

interface shape  {
void findarea();
}
interface size {
    void calsize() ;
}

 class circle implements shape ,size{
public void findarea() {
    System.out.println("hello from class ") ;
}

}


public class interfacesss {

public static void main(String[] args) {
    shape s = new circle() ;
    s.findarea(); 
}
}







//types of interface : 
//marker interface // functional interface // normal interface 
// 0 abstarcat // 1                         // >1

//@FunctionalInterface // lambda functionn pr hi kam krega -> symbol of lamabda 
// aa a = ()-> {
//     sop (sidha overid kyoki ek hi method h )
// };

//package : package is a collectionn of bytes codesxz 
//need : to avoid naming confliction 
//need : to categorise the bytes codes 
/*package abcpackage;

public class file1ofpackage {

}
 */

/*
public : acesssible all voer the enclosing project
protected : acessible inside the enclosing package inside the sub-class of any package of the enclosi ng prject 
default : package private : acessible onlhy inside the enclosinng package 
private : accesible inside the enclosingg class 







*/