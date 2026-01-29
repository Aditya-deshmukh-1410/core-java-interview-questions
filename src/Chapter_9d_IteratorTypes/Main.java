package Chapter_9d_IteratorTypes;

/*
 * =============================================================
 * TOPIC: Types of Iteration in Java Collections
 *
 * THIS PROGRAM DEMONSTRATES 4 WAYS TO TRAVERSE COLLECTIONS:
 *
 * 1️⃣ Iterator        → Universal cursor for all Collection classes
 * 2️⃣ ListIterator    → Special iterator for List (bidirectional)
 * 3️⃣ Enumeration     → Legacy cursor used with Vector/Hashtable
 * 4️⃣ For-Each Loop   → Simplified traversal 
 *
 * =============================================================
 * 🔽 ITERATOR
 * =============================================================
 * - Works with all Collection classes
 * - Can move only FORWARD
 * - Can REMOVE elements during traversal
 * Methods:
 *   hasNext()
 *   next()
 *   remove()
 *
 * =============================================================
 * 🔽 LISTITERATOR
 * =============================================================
 * - Works only with List implementations (ArrayList, LinkedList)
 * - Can move FORWARD and BACKWARD
 * - Can ADD, SET, REMOVE elements
 * Methods:
 *   hasNext(), next()
 *   hasPrevious(), previous()
 *
 * =============================================================
 * 🔽 ENUMERATION (Legacy)
 * =============================================================
 * - Used with Vector and Hashtable
 * - Only FORWARD traversal
 * - Cannot remove elements
 * Methods:
 *   hasMoreElements()
 *   nextElement()
 *
 * =============================================================
 * 🔽 FOR-EACH LOOP
 * =============================================================
 * - Simplest way to traverse collections
 * - Internally uses Iterator
 * - Cannot modify collection structure while iterating
 */

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		Emp emp  = new Emp();
		emp.setId(1);
		emp.setName("Ram");
		emp.setSalary(5000);
		
		Emp emp2  = new Emp();
		emp2.setId(2);
		emp2.setName("sham");
		emp2.setSalary(6000);
		
		Emp emp3  = new Emp();
		emp3.setId(3);
		emp3.setName("raghu");
		emp3.setSalary(7000);
		
		Emp emp4  = new Emp(); 
		emp4.setId(4);
		emp4.setName("naman");
		emp4.setSalary(9000);
		
		List<Emp> list = new ArrayList<>();
		
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println("---- Using Iterator -----");
		
		Iterator<Emp> iterator  = list.iterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
		}
		
		System.out.println("---- Using ListIterator -----");
		
		System.out.println("Forward traversal....");
		ListIterator<Emp> iterator2  = list.listIterator();
		while (iterator2.hasNext()) {
			Emp emp5 = (Emp) iterator2.next();
			System.out.println(emp5);
		}
		
		System.out.println("Backward traversal....");
		ListIterator<Emp> iterator3  = list.listIterator(list.size()); // points to last index
		while (iterator3.hasPrevious()) {
			Emp emp5 = (Emp) iterator3.previous();
			System.out.println(emp5);
		}
		
		System.out.println("---- Using Enumerator -----");
		
		Emp emp5  = new Emp();
		emp5.setId(1);
		emp5.setName("Ram");
		emp5.setSalary(5000);
		
		Emp emp6  = new Emp();
		emp6.setId(2);
		emp6.setName("soham");
		emp6.setSalary(6000);
		
		Emp emp7  = new Emp();
		emp7.setId(3);
		emp7.setName("raghu");
		emp7.setSalary(7000);
		
		Emp emp8  = new Emp();
		emp8.setId(4);
		emp8.setName("Fraz");
		emp8.setSalary(9000);
		
		Vector<Emp> vector = new Vector<>();
		vector.add(emp5);
		vector.add(emp6);
		vector.add(emp7);
		vector.add(emp8);
		
		Enumeration<Emp> enumeration  = vector.elements();
		while (enumeration.hasMoreElements()) {
			Emp emp9 = (Emp) enumeration.nextElement();
			System.out.println(emp9);
		}
		
	
		System.out.println("---- For Each Loop ----");
		
		
		for (Emp emp9 : list) {
			System.out.println(emp9);
		}
		System.out.print("\n");
		for (Emp emp9 : vector) {
			System.out.println(emp9);
		}
		
	}
}

/*
	Output
 * ---- Using Iterator -----
 * Emp [id=1, name=Ram, salary=5000.0]
 * Emp [id=2, name=sham, salary=6000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=4, name=naman, salary=9000.0]
 *
 * ---- Using ListIterator -----
 * Forward traversal....
 * Emp [id=1, name=Ram, salary=5000.0]
 * Emp [id=2, name=sham, salary=6000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=4, name=naman, salary=9000.0]
 *
 * Backward traversal....
 * Emp [id=4, name=naman, salary=9000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=2, name=sham, salary=6000.0]
 * Emp [id=1, name=Ram, salary=5000.0]
 *
 * ---- Using Enumerator -----
 * Emp [id=1, name=Ram, salary=5000.0]
 * Emp [id=2, name=soham, salary=6000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=4, name=Fraz, salary=9000.0]
 *
 * ---- For Each Loop ----
 * Emp [id=1, name=Ram, salary=5000.0]
 * Emp [id=2, name=sham, salary=6000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=4, name=naman, salary=9000.0]
 *
 * Emp [id=1, name=Ram, salary=5000.0]
 * Emp [id=2, name=soham, salary=6000.0]
 * Emp [id=3, name=raghu, salary=7000.0]
 * Emp [id=4, name=Fraz, salary=9000.0]
 *

 */
