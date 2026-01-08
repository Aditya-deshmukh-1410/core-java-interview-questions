
/*
 * Interview Topic: Static vs Non-static Members
 * Source: Core Java Assignment (Chapter 1)
 * Concepts: static variables, instance variables, static methods
 */


package com.static_nonstatic;

class Employee{
	
	int id = 10;
	String name = "Ram";
	double salary = 45000;
	
	static String company_name = "Google";
	static String company_address = "Banglore";
	
	public void displayInfo() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	}
	
	public static void displayCompanyInfo() {
		System.out.println("Company name: "+company_name);
		System.out.println("Company address: "+company_address);
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.displayInfo();
		Employee.displayCompanyInfo();
		
	}
}


/*
	Output:
	
	Employee id: 10
	Employee name: Ram
	Employee salary: 45000.0
	Company name: Google
	Company address: Banglore
*/