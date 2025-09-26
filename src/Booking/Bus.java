
package Booking;


public class Bus extends TransportService{
    private String busCompany;
    private String boardingPoint;
    
    public Bus (){
        
    }
    public Bus (int id, String origin, String destination, double price, String busCompany, String boardingPoint){
        super (id, origin, destination, price);
        this.setBusCompany(busCompany);
        this.setBoardingPoint(boardingPoint);
    }
    public final void setBusCompany (String busCompany){
        this.busCompany = busCompany;
    }
    public final void setBoardingPoint (String boardingPoint){
        this.boardingPoint = boardingPoint;
    }
    public String getBusCompany(){
        return this.busCompany;
    }
    public String getBoardingPoint(){
        return this.boardingPoint;
    }
    @Override
    public String getServiceInformation() {
        String str = "";
        return str;
    }
    
    @Override
    public String getLuggageInformation() {
        String str = "";
        return str;
    }
    
    @Override
    public String toString(){
        String str = "";
        return str;
    }
}
