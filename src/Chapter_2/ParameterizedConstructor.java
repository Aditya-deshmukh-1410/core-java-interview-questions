/*
 * Topic: Parameterized Constructor in Java
 * 
 * Description:
 * Demonstrates how to initialize object data using
 * a parameterized constructor.
 * 
 * Concepts Used:
 *  - Constructor with parameters
 *  - this keyword
 *  - Method overriding (toString)
 */

package Chapter_2;

class Employee{
	
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
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		
		Employee employee  = new Employee(10, "Naman", 25000);
		System.out.println(employee);
	}
}

/*
 * Output:
 * Emp [id=10, name=Naman, salary=25000.0]
 */
