
package Booking;
import Customers.Passenger;

public class MainSystem {
    
    public static void main(String[] args){
        
        
      
        TransportService flight1 = new Flight(23, "bucaramanga", "bogota", 100.000, "avianca", "ejecutivo");
        TransportService bus1 = new Bus();
        TransportService train1 = new Train();
        
        Passenger p1 = new Passenger();
        p1.addTransportService(bus1);
        p1.addTransportService(flight1);
        p1.addTransportService(train1);
        System.out.println(flight1.toString());
    }
    
}
