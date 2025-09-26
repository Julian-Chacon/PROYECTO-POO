
package Booking;


public class Train extends TransportService {
    private String seatType;
    private int wagonNumber;
    
    public Train(){
    }
    public Train(int id, String origin, String destination, double price, String seatType, int wagonNumber){
    super(id, origin, destination, price);
    setSeatType(seatType);
    setWagonNumber(wagonNumber);
    }
    public final void setSeatType(String seatType){
        this.seatType = seatType;
    }
    public final void setWagonNumber(int wagonNumber){
        this.wagonNumber = wagonNumber;
    }
    public String getSeatType(){
        return this.seatType;
    }
    public int getWagonNumber(){
        return this.wagonNumber;
    }
    @Override
    public String getServiceInformation(){
        String str="";
    return str;
    }
    @Override
    public String getLuggageInformation(){
        String str="";
    return str;
    }
    @Override
    public String toString(){
        String str = this.getSeatType() + this.getWagonNumber() + this.getServiceInformation() + this.getLuggageInformation() + super.toString();
            return str;
    }
}
