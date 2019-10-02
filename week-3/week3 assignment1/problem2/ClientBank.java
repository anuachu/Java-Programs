public class ClientBank{

     public static void main(String args[]){
       Address address2 = new Address(72,"malleshwaram","karanataka",560003);
       SavingsAccount bank2 = new SavingsAccount("anusha",4567,"12-05-1986","Malleshwaram",50000,address2);
       bank2.printAddress(address2);
       bank2.withDraw(2000);
       bank2.accountHolder();
        

        CurrentAccount bank3 = new CurrentAccount("ashwini", 6789, " 13-05-1996", "vyalikaval", 60000, address2);
        bank3.withDraw(12000);
        bank3.accountHolder();
     }
}