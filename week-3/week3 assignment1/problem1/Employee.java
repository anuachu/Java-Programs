public class Employee{
    private String name;
     private int id;
     private int age;
    private String skills[] = new String[10];
    private int numSkills;
    

    public Employee (String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void addSkills(String skills){
        this.skills[numSkills] = skills;
        this.numSkills++;
        System.out.println("skills of employee are:"+skills);
    }

    public void Emp(){
        System.out.println("Employee name is:"+" "+this.name);
        System.out.println("Employee id is:"+" "+this.id);
        System.out.println("Employee age is:"+" "+this.age);
    }
}