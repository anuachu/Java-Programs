public class Cart {
    private int numItem;
    private int maxofItem = 5;
    private String itemName[] = new String[5];
    private int itemQuantity[] = new int[5];
    private int itemPrice[] = new int[5];
    private int itemIndex = 0;
    private int totalAmount;

public void generateBill(){
    for (int index = 0; index < this.itemName.length;index++)
    {
     this.totalAmount = this.totalAmount + this.itemQuantity[index] * this.itemPrice[index];
    }
System.out.println("Total bill genrated:"+ " " +this.totalAmount);
}

public void addtoCart(String itemName,int itemQuantity,int itemPrice)
{
if(this.numItem <= this.maxofItem){
 this.itemName[itemIndex] = itemName;
 this.itemQuantity[itemIndex] = itemQuantity;
 this.itemPrice[itemIndex] = itemPrice;
 this.numItem++;
 this.itemIndex++;
}
else if(this.numItem > this.maxofItem){
    System.out.println("Cart is full");
    
}

}

    public void removefromCart(String itemName,int itemQuantity){

        for (int index = 0; index < this.itemName.length; index++ )
        if(this.itemName[index] == itemName){
          System.out.println("Item found");
          this.itemQuantity[index] = this.itemQuantity[index] - itemQuantity; 
        }
        else{
            System.out.println("Item not found");
        }

        }

    
    
   public void cartDisplay(){
       for(int index = 0; index < this.itemName.length;index++){
         System.out.println("Item Name:"+this.itemName[index]);
         System.out.println("Item Quantity:"+this.itemQuantity[index]);
         System.out.println("Item Price:"+this.itemPrice[index]);
 }
    


       
   } 
}
