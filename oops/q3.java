/* 3. Movie Ticket Booking
A cinema hall stores ticket booking information. Create a class MovieTicket with private variables:
movieName
ticketPrice
numberOfTickets
Using getters calculate total cost.
If tickets ≥ 5 give 5% discount.*/

class  MovieTicket {
    private int nooftkt;private float tktprice, totalcost  ;private String moviename ;

void setMoviename(String n) {
moviename = n ;
}
void settkt(int n) {
nooftkt = n ;
}
void settktprice(float p ){
tktprice = p ;
}

void gettktcost() {
 totalcost = nooftkt*tktprice ;

}
void show() {
System.out.println("Movie Name :" +moviename) ;
System.out.println("No Of Tickets : "+nooftkt) ;
System.out.println("Total Cost :"+totalcost +"Rs") ;
}

}

public class q3 {
    public static void main(String args[]) {
        MovieTicket m1 = new MovieTicket();
        m1.setMoviename("READY");
        m1.settktprice(300);
        m1.settkt(6);
        m1.gettktcost();
         m1.show() ;

    }

}
/*Movie Name :READY
No Of Tickets : 6
Total Cost :1800.0Rs */