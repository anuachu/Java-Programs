public class Bank{
    private String holderName;
    private int accNumber;
    private String accCreationDate;
    private String branchName;
    private int balance;
    private Address address;
    private String nominees[] = new String[5];
    private int numNominee;
    

    public Bank(String holderName,int accNumber,String accCreationDate,String branchName,int balance,Address address){
        this.holderName = holderName;
        this.accNumber = accNumber;
        this.accCreationDate = accCreationDate;
        this.branchName = branchName;
        this.balance = balance;
        this.address = address;
    }

    public void printAddress(Address address)
    {
        System.out.println(address.city+" "+address.flatno+" "+address.Street+" "+address.State+ " "+address.pinCode);
    }
        
    
 public void updateNominee(String nominees){
    this.nominees[numNominee] = nominees;
     numNominee++;
     System.out.println("your Nominee is :"+nominees);
 }
    public void accountHolder(){
        System.out.println("Account holder Name is:"+" "+this.holderName);
        System.out.println("Account holder Number is :"+" "+this.accNumber);
        System.out.println("Account holder Creation Date is :"+" "+this.accCreationDate);
        System.out.println("Account holder branchName is:"+" "+this.branchName);
        System.out.println("Account holder balance is:"+" "+this.balance);
        printAddress(this.address);
    }
}