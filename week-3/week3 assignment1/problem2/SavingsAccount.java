public class SavingsAccount extends Bank {
    private int balance;
    
  public SavingsAccount(String holderName,int accNumber,String accCreationDate,String branchName,int balance,Address address){
        super(holderName,accNumber,accCreationDate,branchName,balance,address);
        this.balance = balance;
    }
    public void withDraw(int amount)
        {
            if(amount > 25000){
            System.out.println("Invalid");
            }else if(amount < 250000 && amount >  0){
                this.balance  =this.balance - amount;
                System.out.println("Balance of Client is:"+amount);
            }


        }
     public void accountHolder(){
         super.accountHolder();
     }
}