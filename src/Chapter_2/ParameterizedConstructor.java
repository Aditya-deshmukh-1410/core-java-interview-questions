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
