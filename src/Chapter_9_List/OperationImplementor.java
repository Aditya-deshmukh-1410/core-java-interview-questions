package Chapter_9_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImplementor implements Operation{
	
	List<Emp> db = new ArrayList<>();
	
	@Override
	public void add(List<Emp> emps) {
		db.addAll(emps);
		System.out.println("data added....");
	}

	@Override
	public void update(int id, String name, double salary) {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("data updated....");
				break;
			}
		}
		
	}

	@Override
	public void delete(int id) {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				iterator.remove();
				System.out.println("data deleted....");
				break;
			}
		}
		
	}

	@Override
	public void search(int id) {
		Iterator<Emp> iterator  = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				System.out.println("Searched data: "+emp);
				break;
			}
		}
	}

	@Override
	public void show() {
		Iterator<Emp> iterator = db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}
		
	}

}
