public class Vehicle{
    private int registrationnumber;
    private String make;
    private String model;
    private String modelNo;
    private String color;

public Vehicle(int registrationnumber,String make,String model,String modelNo,String color){
    this.registrationnumber = registrationnumber;
    this.make = make;
    this.model = model;
    this.modelNo = modelNo;
    this.color = color;
}
public void VehicleStatus(){
    System.out.println("The vehicle registeration number is:"+registrationnumber);
    System.out.println("The vehicle make is:"+make);
    System.out.println("The vehicle model is:" +model);
    System.out.println("The vehicle modelNo is:" +modelNo);
    System.out.println("The vehicle color is:" +color);
}
}










