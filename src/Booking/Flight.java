
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
    
    public String getAirline(){
    return this.airline;
    }
    
    public String getSeatClass(){
    return this.seatClass;
    }
    
    @Override
    public String getServiceInformation(){
        String str="\nEl vuelo sale en una hora";
    return str;
    }
    
    @Override
    public String getLuggageInformation(){
        String str="\nel equipaje tiene coca";
    return str;
    }
    
    @Override
    public String toString(){
        String str= super.toString();
        str += "\nAreolinea: " + this.getAirline() + "\nTipo de asiento: " + this.getSeatClass() + "\n" + this.getServiceInformation() + "\n" + this.getLuggageInformation();
    return str;
    }
}
