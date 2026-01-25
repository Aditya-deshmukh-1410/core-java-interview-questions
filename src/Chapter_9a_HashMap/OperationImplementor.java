package Chapter_9a_HashMap;

import java.util.HashMap;
import java.util.Map;

public class OperationImplementor implements Operation{

	HashMap<Integer,Emp> db = new HashMap<>();
	
	@Override
	public void add(HashMap<Integer, Emp> hashMap) {
		db.putAll(hashMap);
		System.out.println("data inserted....");
		
	}

	@Override
	public void update(int id, Emp emp) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			if(key==id) {
				db.replace(key, emp);
				System.out.println("data updated....");
				break;
			}
			
		}
		
	}

	@Override
	public void delete(int id) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			if(key==id) {
				System.out.println("data deleted....");
				db.remove(key);
				break;
			}
			
		}
		
	}

	@Override
	public void search(int id) {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			Emp val = entry.getValue();
			if(key==id) {
				System.out.println("Searched data : "+val);
				break;
			}
			
		}
		
	}

	@Override
	public void show() {
		for (Map.Entry<Integer, Emp> entry : db.entrySet()) {
			Integer key = entry.getKey();
			Emp val = entry.getValue();
			System.out.println(key+" - "+val);
			
		}
		
	}

}
