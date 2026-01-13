/*
 * Topic: POJO (Plain Old Java Object)
 * 
 * Description:
 * Demonstrates the use of a POJO class with
 * private data members and public getters
 * and setters (Encapsulation).
 * 
 * Concepts Used:
 *  - Encapsulation
 *  - Getters and Setters
 *  - Data hiding
 */



package Chapter_2;

class Employe{
	
	private int id;
	private String name;
	private double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Pojo {
	public static void main(String[] args) {
		
		Employe emp  = new Employe();
		emp.setId(101);
		emp.setName("Rahul");
		emp.setSalary(25000);
		
		System.out.println("Employee id: "+emp.getId());
		System.out.println("Employee name: "+emp.getName());
		System.out.println("Employee salary: "+emp.getSalary());
		
	}
}


/*
 * Output:
 * Employee id: 101
 * Employee name: Rahul
 * Employee salary: 25000.0
 */
