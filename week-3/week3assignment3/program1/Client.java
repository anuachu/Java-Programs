public class Client{
    
public static void main(String args[]){
        GoodsVehicle goodsVehicle = new GoodsVehicle(9008, "Truck", "Hauben","IAA 2010" , "grey");
        goodsVehicle.goodsStatus();
        goodsVehicle.goods(200,20);
        goodsVehicle.goodsStatus();
        System.out.println("Is the Vehicle overloaded "+goodsVehicle.overLoaded());
        System.out.println(goodsVehicle.carry());

        PassengerVehicle Vehicle = new PassengerVehicle(8005, "bus", "i20", "2018","Red");
        Vehicle.peopleStatus();
        Vehicle.people(50);
        Vehicle.peopleStatus();
        System.out.println("Is the Vehicle overloaded "+Vehicle.overLoaded());
        System.out.println(Vehicle.carry());

        LuxuryVehicle luxuryVehicle = new LuxuryVehicle (1896, "Car", "BMW","I7 series" , "Black");
        luxuryVehicle.peopleStatus();
        luxuryVehicle.people(2);
        luxuryVehicle.peopleStatus();
        System.out.println("Is the Vehicle overloaded "+luxuryVehicle.overLoaded());
        System.out.println(luxuryVehicle.carry());
   
        RacingCar RVehicle = new RacingCar (1986, "Car", "Ferrai"," series" , "Black");
        RVehicle.peopleStatus();
        RVehicle.people(1);
        RVehicle.peopleStatus();
        System.out.println("Is the Vehicle overloaded "+RVehicle.overLoaded());
        System.out.println(RVehicle.carry());
   


    }
    
}