package com.greatlearning.fsd.week5.assign3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import com.greatlearning.fsd.week5.assign3.Employee.Department;

public class Client {
	
	public static void main(String args[]) {
		Department hr     = Department.HR; 
		Department sales = Department.SALES;
		Department finance = Department.FINANCE;
		Department marketing = Department.MARKETING;	
		
		Employee employee = new Employee(1,"Anusha",22,8000,sales);
		Employee employee1 = new Employee(2,"Ashwini",22,80000,hr);
		Employee employee2 = new Employee(3,"Mohan",27,8000,finance);
		Employee employee3 = new Employee(4,"Vignesh",62,21600,marketing);
		Employee employee4 = new Employee(5,"Geetha",72,16000,sales);
		Employee employee5 = new Employee(6,"Gowri",42,50000,finance);
		Employee employee6 = new Employee(7,"Asok",28,9000,sales);
		Employee employee7 = new Employee(8,"Manohar",27,4300,hr);
		Employee employee8 = new Employee(9,"Venkatesh",72,5787,marketing);
		Employee employee9 = new Employee(10,"Shyam",62,8000,hr);
		
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		employeeList.add(employee8);
		employeeList.add(employee9);
		
		
		employeeList.forEach(e -> System.out.println(e.toString()));
		
		List<Employee> sortedList = new ArrayList<Employee>();
		
		sortedList.forEach(e -> System.out.println(e.toString()));


		
Scanner sc = new Scanner(System.in);
		
		int Option = sc.nextInt();
		
		switch(Option){
			case 1:{
				System.out.println("age");
				int age = sc.nextInt();
				sortedList = filterEmployee(employeeList, p -> p.getAge() < age );
				sortedList.forEach( e -> System.out.println(e.toString()));
				break;
			}
			case 2:{
				System.out.println(" age ");
				int age = sc.nextInt();
				sortedList = filterEmployee(employeeList, p -> p.getAge() > age );
				sortedList.forEach( e -> System.out.println(e.toString()));
				break;
			}
			case 3:{
				System.out.println(" age");
				int age = sc.nextInt();
				String Department = sc.nextLine();
				sortedList = filterEmployee(employeeList, p -> p.getAge() > age && p.getDepartment().equals(Department));
				sortedList.forEach( e -> System.out.println(e.toString()));
			}
			case 4:{
				System.out.println(" age");
				int age = sc.nextInt();
				String Department = sc.nextLine();
				sortedList = filterEmployee(employeeList, p -> p.getAge() < age && p.getDepartment().equals(Department));
				sortedList.forEach( e -> System.out.println(e.toString()));
			}
				
		}
			
	}
		
		
		private static List<Employee> filterEmployee(List<Employee> employeeList,Predicate<Employee> predicate){
			
			List<Employee> filteredEmployee = new ArrayList<Employee>();
			
			for(Employee employee : employeeList) {
				if(predicate.test(employee)) {
					filteredEmployee.add(employee);
				}
			}
			return filteredEmployee;
			
		}

}





