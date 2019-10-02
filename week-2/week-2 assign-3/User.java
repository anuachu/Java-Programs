public class User{
    private  String name;
    private int balance = 50000;
    private int accountBalance;
    private String updateNomniee;
    private int withDrawmoney;



public User( String name,int accountBalance,String updateNomniee,int withDrawmoney){
    this.name = name;
    this.accountBalance = accountBalance;
    this.updateNomniee = updateNomniee;
    this.withDrawmoney = withDrawmoney;
}

public void withDrawslip(int amount){
     if(amount < balance){
     System.out.println("Remaining balance:"+(balance-amount));
     }
     else if(amount > balance){
         System.out.println(" balance is invalid ");
     }
    }
public void withDrawAtm(int amount){
    if(amount < balance){
        System.out.println("Remaining balance:"+(balance-amount));
        }
        else if(amount > balance){
            System.out.println(" balance is invalid ");}
}

        public void depositChalen(int amount){
            System.out.println("deposited"+ amount +" via challan");
            this.balance = balance + amount;
            System.out.println("Updated Balance"+amount);
        }
        public void depositAtm(int amount){
            System.out.println("deposited"+ amount +" via ATM");
            this.balance = balance + amount;
            System.out.println("Updated Balance"+amount);
        }
    
    
public void accountStatus(){
    System.out.println(name+" "+accountBalance+" "+" "+updateNomniee);


}}
