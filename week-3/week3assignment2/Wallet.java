public class Wallet extends Payment{
    private int amount;
     
    public Wallet(int amount,String to,String from){
     super(amount,to,from);
    }
     public void WalletPay(int amount){
        this.amount = amount;
    }
    public void payment(int amount){
        if(this.amount  > amount ){
        this.amount = this.amount - amount;
        System.out.println("Transaction is succesfull");
    }
        else if(this.amount < amount){
            System.out.println("Transaction unsucessfull");
        }
    }
}