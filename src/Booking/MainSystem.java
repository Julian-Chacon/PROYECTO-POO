
package Booking;
import Customers.Passenger;

public class MainSystem {
    
    public static void main(String[] args){
        
        System.out.println("Prueba");
        
        TransportService flight1 = new Flight();
        TransportService bus1 = new Bus();
        
        Passenger p1 = new Passenger();
        p1.addTransportService(bus1);
        p1.addTransportService(flight1);
        
    }
    
}
