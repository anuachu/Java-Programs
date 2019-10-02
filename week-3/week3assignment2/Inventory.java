public class Inventory {
        private int numItem;
        private int maxofItem = 5;
        private String itemName[] = new String[5];
        private int itemQuantity[] = new int[5];
        private int itemPrice[] = new int[5];
        private int itemIndex = 0;

        
    
    public void addtoInventory(String itemName,int itemQuantity,int itemPrice)
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
    
        public void removefromInventory(String itemName,int itemQuantity){
    
            for (int index = 0; index < this.itemName.length; index++ )
            if(this.itemName[itemIndex] == itemName){
              System.out.println("Item found");
              this.itemQuantity[index] = this.itemQuantity[index] - itemQuantity; 
                }
            else {
                System.out.println("Item not found");
            }
    
            }
    
        
        
       public void InventoryDisplay(){
           for(int index = 0; index < this.itemName.length;index++){
             System.out.println("Item Name:"+" "+this.itemName[index]);
             System.out.println("Item Quantity:"+" "+this.itemQuantity[index]);
             System.out.println("Item Price:"+" "+this.itemPrice[index]);
     }
        
    
    
           
       } 
    }
    
    


