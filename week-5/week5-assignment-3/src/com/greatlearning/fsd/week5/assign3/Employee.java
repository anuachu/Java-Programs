package com.greatlearning.fsd.week5.assign3;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private double salary;
	private Department department;
	
enum Department{
	HR,FINANCE,MARKETING,SALES
}

public Employee(int id, String name, int age, double salary,Department department) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
    this.department = department;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}



@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
			+ department + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((department == null) ? 0 : department.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (department != other.department)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}

@Override
public int compareTo(Employee emp) {
	if(this.id > emp.id) {
		return 1;
		}
	else if(this.id < emp.id) {
		return -1;
		}
	return 0;
}

}
