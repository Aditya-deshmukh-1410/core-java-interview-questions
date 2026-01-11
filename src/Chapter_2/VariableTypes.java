package Chapter_2;

class Emp{
	
	String name = "Harry"; // global variable
	
	static String c_name = "MacroSoft" ;  // static variable 
	
	void calSalary(double salary) { // local variable
		System.out.println("Employee salary: "+salary);
	}
	
}


public class VariableTypes {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		System.out.println(emp.name);  // accessed global variable
		
		System.out.println(Emp.c_name);  // accessed static variable
		
		emp.calSalary(25000);   // accessed local variable
		
	}
}
