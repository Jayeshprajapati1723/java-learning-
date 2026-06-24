//a class only one object will be created chah ke bhi ek se jadda object never use 
class M {
private M() {

}
static M getinstance () {
return new M();
}
}
public class singletonc {
    // M M1 = new M() ;//error
    // M M2 = new M() ;//error
    //do object bn rhe h 
    // to class se bahar restrict krna hoga 
       
}
