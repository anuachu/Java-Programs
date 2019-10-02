public class Fashion extends Item{
    
    public Fashion(int id,String name,String description,int price){
        super(id, name, description, price);
    }

    public void fashionStatus(){

    }
}

class Bangles extends Fashion{
    int cost = 500;
   
    public Bangles(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void bangles1(int cost){
       this.cost = cost;
   }
   public void banglesStatus(){
       System.out.println("Cost of Bangles is:"+ "  "+this.cost);
   }
}

class LakmelipStick extends Fashion{
    int cost = 400 ;
   
    public LakmelipStick(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void lipStick(int cost){
       this.cost = cost;
   }
   public void lipStickStatus(){
       System.out.println("Cost of Lakme lipstick is:"+ "  "+this.cost);
   }
}