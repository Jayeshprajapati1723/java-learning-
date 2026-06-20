/*An ed-tech platform stores information about students enrolling in courses. Create a class CourseStudent with private variables:
studentName
courseName
courseFee
discountPercent
Using setters assign values. Using getters calculate the final payable fee:
finalFee = courseFee - (courseFee * discountPercent / 100)
Print the student name, course, and final fee. */

class CourseStudent {
private String sname ,crsname;
private float crsfees ,discount ;

void setter(String n ,String crs,float f ,float d) {
sname = n ;
crsname =crs ;

discount =d ;
crsfees = f-(f*discount/100) ;
}

void getter () {
    System.out.println("welcome to our coaching institue") ;
System.out.println("student name :"+sname) ;
System.out.println("course name : " +crsname) ;
System.out.println("you got " +discount+ "% off on opted course  ") ;
System.out.println("course fee final after discount" +crsfees) ;
}
}
public class s1clsassqsn1 {
    public static void main(String[] args) {
CourseStudent s1= new CourseStudent()  ;
s1.setter("jayesh", "c++", 1000, 10);
s1.getter(); 

CourseStudent s2= new CourseStudent()  ;
s2.setter("anurag", "java", 10000, 100);
s2.getter(); 
    }
}
