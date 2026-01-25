package Chapter_9b_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emp implements Comparable<Emp>{

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
	@Override
	public int compareTo(Emp o) {
		
//		return Integer.compare(this.id, o.id);
		
		if(this.id > o.id) {
			return 1;
		}else if(this.id < o.id) {
			return -1;
		}else {
			return 0;
		}
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
		
		ArrayList<Emp> arrayList = new ArrayList<>();
		arrayList.add(emp2);
		arrayList.add(emp);
		arrayList.add(emp3);
		
		System.out.println("---- Before sorting data ----");
		
		Iterator<Emp> iterator  = arrayList.iterator();
		while (iterator.hasNext()) {
			Emp emp4 = (Emp) iterator.next();
			System.out.println(emp4);
		}
		
		System.out.println("---- After sorting data ----");
		
		Collections.sort(arrayList);
		Iterator<Emp> iterator2  = arrayList.iterator();
		while (iterator2.hasNext()) {
			Emp emp4 = (Emp) iterator2.next();
			System.out.println(emp4);
		}
		
		
	}
	
	
	
}










