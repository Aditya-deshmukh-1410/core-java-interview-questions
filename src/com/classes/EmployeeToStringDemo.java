/*
 * Interview Topic: Classes & Objects
 * Source: Core Java Assignment (Chapter 1)
 * Concepts Covered:
 *  - Class and Object
 *  - Constructor
 *  - toString() method
 */

package com.classes;

 class Employee{
	
	int id;
	String name;
	double salary;
	String address;
	
	public Employee(int id, String name, double salary,String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeToStringDemo [id=" + id + ", name=" + name + ", salary=" + salary + ",address="+ address +"]";
	}
	
	public void displayInfo() {
		System.out.println("Employee id: "+id);
		System.out.println("Emp name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee address: "+address);
	}
}
 
 public class EmployeeToStringDemo{
	 public static void main(String[] args) {
			
		 Employee emp  = new Employee(1, "Aditya", 40000, "Mumbai");
			emp.displayInfo();
			System.out.println(emp);
			
		}
 }
 
 /*Output of the code:
 
 - Employee id: 1
 - Emp name: Aditya
 - Employee salary: 40000.0
 - Employee address: Mumbai
 - EmployeeToStringDemo [id=1, name=Aditya, salary=40000.0,address=Mumbai]
 
 */



