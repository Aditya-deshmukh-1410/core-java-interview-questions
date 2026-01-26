package Chapter_9_List;
/*
 * CORE JAVA CONCEPTS USED:
 * - Collections Framework (List, ArrayList)
 * - Object storage in collections
 * - Encapsulation (POJO class)
 * - Method calling via another class (OperationImplementor)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Ram");
		emp.setSalary(4000);
		
		Emp emp2  = new Emp();
		emp2.setId(2);
		emp2.setName("sham");
		emp2.setSalary(3000);
		
		Emp emp3  = new Emp();
		emp3.setId(3);
		emp3.setName("raju");
		emp3.setSalary(5000);
		
		Emp emp4  = new Emp();
		emp4.setId(4);
		emp4.setName("rohan");
		emp4.setSalary(5500);
		
		List<Emp> list = new ArrayList<>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		
		OperationImplementor op = new OperationImplementor();
		
		op.add(list);  // Add all employees to internal list
		op.show();
		
		op.update(3, "naman", 3300);  // Update employee with id=3
		op.show();
		
		op.delete(2);   // Remove employee with id=2
		op.show();
		
		op.search(4);   // Search employee with id=4
		
	}
}


 /*EXPECTED OUTPUT FLOW (example):
 * --- Initial List ---
  - 1 Ram 4000
  - 2 sham 3000
  - 3 raju 5000
  - 4 rohan 5500
 
 * --- After Update (id=3) ---
  - 3 naman 3300
 
 * --- After Delete (id=2 removed) ---
  - List size decreases
 
 * --- Search Result ---
  - Employee with id=4 found
*/
