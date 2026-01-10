package com.overlaoding_overriding;


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
		System.out.println("Accountant salary with tax: "+(salary+bonus-tax));
	}
}


public class Main {
	public static void main(String[] args) {
	
		Accountant accountant = new Accountant();
		accountant.calSalary(10000);
		accountant.calSalary(10000, 1000);
		accountant.calSalary(10000, 1000, 500);
		
		Employee employee  = new Employee();
		employee.calSalary(15000);
		employee.calSalary(15000, 1000);
		employee.calSalary(15000, 1000, 500);
		
	}
}
