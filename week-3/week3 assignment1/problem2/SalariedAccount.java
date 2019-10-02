public class SalariedAccount extends SavingsAccount{
 private int  balance;
  
 public SalariedAccount(String holderName,int accNumber,String accCreationDate,String branchName,int balance,Address address){
    super(holderName,accNumber,accCreationDate,branchName,balance,address);
    this.balance = balance;
     }
public void withDraw(int amount)
    {
        super.withDraw(amount);
    }
    public void accountHolder(){
        super.accountHolder();
    }
    }


