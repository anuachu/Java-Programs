public class Client{

    public static void main(String args[]){
 
  RegularEmployee emp2 = new RegularEmployee("anusha",001,24);
  emp2.applyleave(20);
  emp2.Emp();

  ContractEmployee emp3 = new ContractEmployee("anusha",001,24);
  emp3.applyleave(2);
  emp3.Emp();

}}