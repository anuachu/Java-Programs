public class Client{
    
    public static void main(String args[])
    {
       Address sellerAddress = new Address(12, "8th cross", "Bangalore", "Karnataka", 56056);
       sellerAddress.addressStatus();

       Item item = new Item(012, "mobiles", "64gb",12000);
       item.displayItem(); 

       Sellers seller = new Sellers(0001, "Victoria Secret", sellerAddress);
       seller.display();
       
       Address userAddress = new Address(38, "vyalikaval", "Bangalore", "Karnataka", 560003);
       userAddress.addressStatus();

       User user = new User(9, "Anusha",userAddress , "9449010222");
       user.userDisplay();

       Cart cart = new Cart();
       cart.addtoCart("usb", 2, 300);
       cart.addtoCart("mobile", 1, 30000);
       cart.addtoCart("cosmetic", 3, 400);
       cart.addtoCart("carpet", 1, 300);
       cart.addtoCart("Dove", 1, 100);
       cart.generateBill();
       cart.cartDisplay();

       Inventory inventory = new Inventory();
       inventory.addtoInventory("victoria secret",3, 600);
       inventory.removefromInventory("victoria secret", 1);
       inventory.InventoryDisplay();
       
       Payment payment = new Payment(1000, "Anusha","ashwini");
       payment.pay();

       Mobile mobile = new Mobile(002, "Samsung", "s7",20000);
       mobile.MobileStatus();

       Samsung samsung = new Samsung(1234, "samsungs3", "gorilla glass", 42000);
       samsung.samsungMob(42000);
       samsung.samsungStatus();

       SamsungS8 samsung1 = new SamsungS8(7890, "samsungS8", "gorilla glass", 52000);
       samsung1.samsungS8Mob(52000);
       samsung1.samsungS8status();

       Fashion fashion = new Fashion(900, "bangles", "colors",500);
       fashion.fashionStatus();

       Bangles bangles = new Bangles(005, "bangles", "color", 500);
       bangles.bangles1(500);
       bangles.banglesStatus();

       LakmelipStick stick = new LakmelipStick(800, "lipstick", "Lakme", 800);
       stick.lipStick(800);
       stick.lipStickStatus();


    }
}