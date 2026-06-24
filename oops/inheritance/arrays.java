
//it is a collection of similar type of data with contigous memory allocation 
// need : we have to create only one variable 
// optimization is easy
// int arr[][]  
import java.util.Scanner;
class jj {
void show() {
    System.out.println("jayesh ji") ;
}
}

public class arrays {
    public static void main(String[] args) {
        int arr[];// int []arr ;
        arr = new int[10];
        String name[] = new String[10];
        Scanner s = new Scanner(System.in) ;
        for (int i = 0; i < 10; i++) {
            // arr[i] = 12;
            // name[i] = "jayesh";
            System.out.println("enter value ") ;
            arr[i] = s.nextInt() ;
            System.out.println("value of int " + arr[i]);
                      System.out.println("enter value for string ") ;
            name[i] = s.next() ;
            System.out.println("value of string " + name[i]);
        }

        // for each loop
        for (int g : arr) {
            System.out.println(g / 2);

        }
jj arey[]= new jj[5] ;//default value null for classs 
// jj[1] = new  jj() ;
// arrey[1] = new j1 ;
    }

}
