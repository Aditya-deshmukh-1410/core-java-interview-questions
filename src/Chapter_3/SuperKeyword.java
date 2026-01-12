package Chapter_3;

class ProjectManager {
	
	String task1 = "Project1";
	String task2 = "Project2";
	
	public ProjectManager() {
		System.out.println("Project manager...");
	}
	
	public void getTaskStatus() {
		System.out.println("Task status!!");
	}
}

class Employee1 extends ProjectManager{
	
	int id;
	String name;
	double salary;
	
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void setTaskStatus() {
		System.out.println("Task1: "+super.task1);
		System.out.println("Task2: "+super.task2);
		super.getTaskStatus();
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		
		Employee1 employee  = new Employee1(11, "Naman", 25000);
		employee.setTaskStatus();
		
	}
}
