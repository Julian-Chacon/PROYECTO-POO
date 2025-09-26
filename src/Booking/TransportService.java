
package Booking;

public abstract class TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    public TransportService(){    
    }
    public TransportService(int id, String origin, String destination, double price){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getId(){
        return this.id;
    }
    public String getOrigin(){
        return this.origin;
    }
    public String getDestination(){
        return this.destination;
    }
    public double getPrice(){
        return this.price;
    }
    
    @Override
    public String toString(){
        String str = "";
        
        return str;
    }
    
    public abstract String getServiceInformation();
    public abstract String getLuggageInformation();
}
