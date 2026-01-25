package Chapter_9_List;

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
		
		op.add(list);
		op.show();
		
		op.update(3, "naman", 3300);
		op.show();
		
		op.delete(2);
		op.show();
		
		op.search(4);
		
	}
}
