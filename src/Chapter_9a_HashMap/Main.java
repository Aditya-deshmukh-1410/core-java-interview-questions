package Chapter_9a_HashMap;

/* CORE JAVA CONCEPTS USED:
  - Collections Framework (HashMap)
  - Key-Value data structure
  - Hashing mechanism
  - Object storage in collections
  - Encapsulation via POJO
  
 CORE JAVA LEARNING:
  ✔ HashMap stores data in key-value pairs
  ✔ put() → insert or update value for a key
  ✔ remove() → delete entry using key
  ✔ get() → retrieve value using key
  
 */

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

/*  OUTPUT :
 data inserted....
 * 1 - Emp [id=11, name=Harshu, salary=5000.0]
 * 2 - Emp [id=12, name=Divesh, salary=6000.0]
 * 3 - Emp [id=13, name=Sahil, salary=7000.0]
 * 4 - Emp [id=14, name=Aditya, salary=8000.0]
 *
 * data updated....
 * 1 - Emp [id=11, name=Harsh, salary=8080.0]
 * 2 - Emp [id=12, name=Divesh, salary=6000.0]
 * 3 - Emp [id=13, name=Sahil, salary=7000.0]
 * 4 - Emp [id=14, name=Aditya, salary=8000.0]
 *
 * data deleted....
 * 1 - Emp [id=11, name=Harsh, salary=8080.0]
 * 2 - Emp [id=12, name=Divesh, salary=6000.0]
 * 4 - Emp [id=14, name=Aditya, salary=8000.0]
 *
 * Searched data : Emp [id=14, name=Aditya, salary=8000.0]
 *
 */

