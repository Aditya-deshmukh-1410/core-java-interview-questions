package Chapter_9c_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emp{

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
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId(101);
		emp.setName("naman");
		emp.setSalary(5000);
		
		Emp emp2  = new Emp();
		emp2.setId(102);
		emp2.setName("sham");
		emp2.setSalary(6000);
		
		Emp emp3 = new Emp();
		emp3.setId(103);
		emp3.setName("raju");
		emp3.setSalary(7000);
		
		ArrayList<Emp> arr = new ArrayList<>();
		arr.add(emp2);
		arr.add(emp);
		arr.add(emp3);
		
		
		System.out.println("---- Before Sorting data ----");
		
		Iterator<Emp> iterator = arr.iterator(); 
		while (iterator.hasNext()) { 
			Emp emp4 = (Emp) iterator.next(); 
			System.out.println(emp4); 
			}
		
		System.out.println("---- Sort by Name ----");

		Collections.sort(arr, new SortByName());

		Iterator<Emp> iterator2 = arr.iterator();  
		while (iterator2.hasNext()) {
		    Emp emp4 = iterator2.next();
		    System.out.println(emp4);
		}

		System.out.println("---- Sort by Salary ----");

		Collections.sort(arr, new SortBySalary());

		Iterator<Emp> iterator3 = arr.iterator();   
		while (iterator3.hasNext()) {
		    Emp emp4 = iterator3.next();
		    System.out.println(emp4);
		}

		
	}
}
