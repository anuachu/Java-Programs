public class GoodsVehicle extends Vehicle{
    private int maxNumofGoods = 200;
    private int NumofGoods;
    private int maxLoads = 20000;
    private int Loads;

public GoodsVehicle(int registrationnumber,String make,String model,String modelNo,String color){
     super(registrationnumber,make,model,modelNo,color);
}

public void goods(int NumofGoods,int Loads){
    this.NumofGoods = NumofGoods;
    this.Loads = Loads;
}

public boolean carry(){
    if(this.Loads < maxLoads){
        System.out.println("The goods can be carried");
    return true;
    }
    else if(this.Loads > maxLoads){
        System.out.println("The goods cannot be carried");
     return false;  
    }
    return true;
}

public boolean overLoaded(){
    if(this.Loads < maxLoads){
        System.out.println("The vehicle is OverLoaded the maximum number of loads the vehicle can carry is:"+this.maxLoads);
    return true;
    }
return false;

}

public void goodsStatus(){
    super.VehicleStatus();
    System.out.println("Max number of goods vehicle can carry:"+maxNumofGoods);
    System.out.println("Max number of load vehicle can carry is:"+maxLoads);
    System.out.println("The number of Goods that can be carried by vehicle is:"+NumofGoods);
    System.out.println("The number of Loads that can be carried by vehicle is:"+Loads);
}
}