/*
 * Interview Topic: Method Overloading & Method Overriding
 * Source: Core Java Assignment
 * Concepts: Compile-time polymorphism, Runtime polymorphism
 */

package com.overloading_overriding;
// Overloading: Methods with same name,different parameters,in same class
// Overriding:  Re-defining methods with same name,same parameter in child class

//parent class
class Accountant{
	public void calSalary(double salary) {
		System.out.println("Accountant salary: "+salary);
	}
	public void calSalary(double salary,double bonus) {
		System.out.println("Accountant salary with bonus: "+(salary+bonus));
	}
	public void calSalary(double salary,double bonus,double tax) {
		System.out.println("Accountant salary with tax: "+(salary+bonus-tax));
	}
	
}

//child class
class Employee extends Accountant{
	@Override
	public void calSalary(double salary) {
		System.out.println("Employee salary: "+salary);
	}
	@Override
	public void calSalary(double salary, double bonus) {
		System.out.println("Employee salary with bonus: "+(salary+bonus));
	}
	@Override
	public void calSalary(double salary, double bonus, double tax) {
		System.out.println("Employee salary with tax: "+(salary+bonus-tax));
	}
}


public class Main {
	public static void main(String[] args) {

		// Overloading demonstration
		Accountant accountant = new Accountant();
		accountant.calSalary(10000);
		accountant.calSalary(10000, 1000);
		accountant.calSalary(10000, 1000, 500);

		// Overriding demonstration
		Employee employee  = new Employee();
		employee.calSalary(15000);
		employee.calSalary(15000, 1000);
		employee.calSalary(15000, 1000, 500);
		
	}
}

/*
 Output:
 Accountant salary: 10000.0
 Accountant salary with bonus: 11000.0
 Accountant salary with tax: 10500.0
 
 Employee salary: 15000.0
 Employee salary with bonus: 16000.0
 Employee salary with tax: 15500.0
*/

