
package Customers;
import Booking.TransportService;


public class Passenger extends Person{
    private String passportNumber;
    private TransportService transportService;
    
 public Passenger(){

     this.transportService = null;   
    }
 public Passenger(String name, int age, String passportNumber){
     super(name, age);
     this.setPassportNumber(passportNumber);
 }
 public void setPassportNumber(String passportNumber){
     this.passportNumber = passportNumber;
 }
 public String getPassportNumber(){
     return this.passportNumber;
 }
 public void addTransportService(TransportService transportService){
     this.transportService = transportService;
 }
 
 @Override
 public String toString(){
     String str = super.toString();
     
     str += "\nPasaporte: " + this.getPassportNumber();
     return str;
 }
}
