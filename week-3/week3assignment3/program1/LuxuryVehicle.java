 public class LuxuryVehicle extends Vehicle{
    private int maxNumofPeople = 2;
    private int numofPeople;

public LuxuryVehicle(int registrationnumber,String make,String model,String modelNo,String color){
    super(registrationnumber, make, model, modelNo, color);
}

public void people(int people){
    if( people > this.maxNumofPeople){
        System.out.println("Can not add "+ people + " to the Vehicle");
        System.out.println("Max number of people that can be accodomate "+ this.maxNumofPeople);
    }
    else if(people <= this.maxNumofPeople){
        this.numofPeople = people;
    }
}
public boolean carry(){
    if(this.numofPeople < this.maxNumofPeople){
        System.out.println("The vehicle can be carry number of people");
    return true;
    }
    else if(this.numofPeople > this.maxNumofPeople){
        System.out.println("The vehicle cannot be carry number of people");
     return false;  
    }
    return true;
 }
 
 public boolean overLoaded(){
    if(this.numofPeople < this.maxNumofPeople){
        System.out.println("The vehicle is OverLoaded the maximum number of people vehicle can carry is:"+this.maxNumofPeople);
    return true;
    }
 return false;
 
 }
 
 public void peopleStatus(){
     super.VehicleStatus();
    System.out.println("Max number of people who can travel is :"+this.maxNumofPeople);
    System.out.println("At present vehicle is loaded:"+this.numofPeople);
 }
} 