package Chapter_9a_HashMap;

import java.util.HashMap;

public interface Operation {
	
	void add(HashMap<Integer, Emp> hashMap );
	void update(int id, Emp emp);
	void delete(int id);
	void search(int id);
	void show();

}
