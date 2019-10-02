public class SavingsAccount{
  private int balance;
  private String name;
  private int age;
  private String nominee1;
  private int panNumber;

  public SavingsAccount(int balance,String name,int age,String nominee1, int panNumber){
      this.balance = balance;
      this.name = name;
      this.age = age;
      this.nominee1 = nominee1;
      this.panNumber =  panNumber;
  }

   public void Saving(){
       System.out.println(balance +" "+ name +" "+age+" " +nominee1+"" +panNumber);
    }
}