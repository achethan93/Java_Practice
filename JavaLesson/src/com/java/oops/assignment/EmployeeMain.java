package com.java.oops.assignment;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name; 
	private int id;
	private String address;
	private double salary;

	public Employee(String name, int id, String address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class Dept {
	String name;
	String location;
	
	List<Employee> employees;

	public Dept(String name, String location) {
		this.name = name;
		this.location = location;
	    employees = new ArrayList<>();
	  
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	
}
	public double getYearExpenditure() {
		double total = 0;
		for (Employee employee : employees) {
			total = total + employee.getSalary();
		}
		return total*12;
		
	}
}
 
public class EmployeeMain {
	public static void main(String[] args) {
		Dept dept = new Dept("Information Technology", "Bangalore");
		Employee employee1=new Employee("Chethan",1,"Bangalore",10000);
		Employee employee2=new Employee("Kishanth",2,"Chennai",20000);
		Employee employee3=new Employee("Prakruthi",3,"Mysore",30000);
		Employee employee4=new Employee("Manoj",4,"Madikeri",40000);
		Employee employee5=new Employee("Kiran",5,"Tirupati",50000);
		
		
		dept.addEmployee(employee1);
		dept.addEmployee(employee2);
		dept.addEmployee(employee3);
		dept.addEmployee(employee4);
		dept.addEmployee(employee5);
		
		System.out.println("The Yearly Expenditure of all Employees are "+  dept.getYearExpenditure());
	}
}