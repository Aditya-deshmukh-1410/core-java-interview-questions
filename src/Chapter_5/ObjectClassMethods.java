package Chapter_5;

/*
 * Demonstrates commonly used methods of the Object class such as
 * toString(), clone(), equals(), hashCode(), getClass(), and finalize().
 */

import java.util.Objects;

class Employee implements Cloneable{
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
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
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Calling finalize method!!");
	}
	
}


public class ObjectClassMethods {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee  = new Employee(10, "Ram", 25000);
		System.out.println(employee);
		
		System.out.println(employee.getClass().getName());
		
		// created clone of employee
		Employee employee2 = (Employee) employee.clone();
		System.out.println(employee2); 
		
		System.out.println(employee.equals(employee2));  // returns true(with hashcode and equal contract)
		
		employee2 = null;
		System.gc();
		
		/*
        Output:
         - Employee [id=10, name=Ram, salary=25000.0]
         - Chapter_5.Employee
         - Employee [id=10, name=Ram, salary=25000.0]
         - true
         - Calling finalize method!!   
        */
		
	}

}
