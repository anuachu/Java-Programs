public class Client{

    public static void main(String args[]){

        SavingsAccount account = new SavingsAccount(12000,"anusha",23,"anu",1234);
        account.Saving();
       

        User savUser = new User("anu",12000,"ashwini",1000);
        savUser.withDrawslip(1000);
        savUser.withDrawAtm(1000);
         savUser.depositChalen(10887);
         savUser.depositAtm(34000);
         savUser.accountStatus();
    }
}