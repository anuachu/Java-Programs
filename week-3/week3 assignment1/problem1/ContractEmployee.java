public class ContractEmployee extends Employee{

    private int payperHour = 100;
    private int durationDays = 10;
    private int leaveDays;
    
       
    public ContractEmployee(String name,int id,int age) {
       super(name,id,age);
    } 

    public void applyleave(int leaveDays)
        {
       this.durationDays = leaveDays + this.durationDays;
       System.out.println("Employee can apply leave for so many days:"+" "+this.durationDays);
        }
    
    public void Emp(){
    super.Emp();
    System.out.println("Payment for Employee for an hour is:"+" "+this.payperHour);
    System.out.println("The Employee is working for :"+" "+this.durationDays+" "+"per day");
}}