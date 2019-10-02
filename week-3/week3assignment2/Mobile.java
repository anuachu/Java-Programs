public class Mobile extends Item{
    
    public Mobile(int id,String name,String description,int price){
        super(id, name, description, price);
    }

    public void MobileStatus(){
    
    }
}

class Samsung extends Mobile{
     int cost = 20000;
    
     public Samsung(int id,String name,String description,int price){
        super(id, name, description, price);
    }

    public void samsungMob(int cost){
        this.cost = cost;
    }

    public void samsungStatus(){
        System.out.println("Cost of Samsung is:"+"  "+this.cost);
    }

}

class SamsungS8 extends Mobile{
    int cost = 42000;
   
    public SamsungS8(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void samsungS8Mob(int cost){
       this.cost = cost;
   }
   public void samsungS8status(){
       System.out.println("Cost of SamsungS8 is:"+ "  "+this.cost);
   }
}