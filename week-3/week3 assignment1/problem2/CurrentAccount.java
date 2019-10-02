public class CurrentAccount extends SavingsAccount {
    private int balance;
   
    public CurrentAccount(String holderName,int accNumber,String accCreationDate,String branchName,int balance,Address address){
        super(holderName,accNumber,accCreationDate,branchName,balance,address);
        this.balance = balance;
    }
    
    public void withDraw(int amount)
    {
      this.balance  =this.balance - amount;
            System.out.println("Balance of Client is:"+amount);
        
        }

        public void accountHolder(){
            super.accountHolder();
        }
}