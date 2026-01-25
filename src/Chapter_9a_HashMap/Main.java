package Chapter_9a_HashMap;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		Emp emp  = new Emp();
		emp.setId(11);
		emp.setName("Harshu");
		emp.setSalary(5000);
		
		Emp emp2  = new Emp();
		emp2.setId(12);
		emp2.setName("Divesh");
		emp2.setSalary(6000);
		
		Emp emp3  = new Emp();
		emp3.setId(13);
		emp3.setName("Sahil");
		emp3.setSalary(7000);
		
		Emp emp4 = new Emp();
		emp4.setId(14);
		emp4.setName("Aditya");
		emp4.setSalary(8000);

		HashMap<Integer, Emp> hashMap  = new HashMap<>();
		hashMap.put(1, emp);
		hashMap.put(2, emp2);
		hashMap.put(3, emp3);
		hashMap.put(4, emp4);
		
		
		OperationImplementor op = new OperationImplementor();
		
		op.add(hashMap);
		op.show();
		
		Emp emp5  = new Emp();
		emp5.setId(11);
		emp5.setName("Harsh");
		emp5.setSalary(8080);
		
		op.update(1, emp5);
		op.show();
		
		op.delete(3);
		op.show();
		
		op.search(4);
	}

}
