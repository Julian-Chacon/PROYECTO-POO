
package Booking;


public class Flight extends TransportService {
    
    private String airline;
    private String seatClass;
    
    public Flight(){
    }
    public Flight(int id, String origin, String destination, double price, String airline, String seatClass ){
    super(id, origin, destination, price);
    this.setAirline(airline);
    this.setSeatClass(seatClass);
    }
    
    public final void setAirline(String airline){
    this.airline = airline;
    }
    
    public final void setSeatClass(String seatClass){
     this.seatClass = seatClass;
    }
    
    
}
