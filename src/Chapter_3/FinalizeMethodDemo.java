package Chapter_3;

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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	 @Override
	protected void finalize() throws Throwable {
		System.out.println("Object is deleted...");
	}
}

public class FinalizeMethodDemo {
	public static void main(String[] args) {
		
		Employee employee = new Employee(10, "Ram", 10000);
		System.out.println(employee);
		
		employee = null;
		
		System.gc();
	}
}
