public class RegularEmployee extends Employee{

    private int vacationDays = 20;
    private int fixedSalary = 20000;
    private int bonus = 100;
    private int durationDays;
    private int leaveDays;


    public RegularEmployee(String name,int id,int age){
        super(name,id,age);
    
    }

    public void applyleave(int leaveDays){
        this.durationDays =  leaveDays - durationDays;
        System.out.println("Regular Employee should work for so many Days:"+" "+durationDays);
    }
    
    public void Emp(){
         super.Emp();
         System.out.println("fixed Salary for Employee"+" "+this.fixedSalary);
         System.out.println("Bonus for Employee"+" "+this.bonus);
        
    }
}