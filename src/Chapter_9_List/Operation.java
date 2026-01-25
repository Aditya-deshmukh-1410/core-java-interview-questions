package Chapter_9_List;

import java.util.List;

public interface Operation {

	void add(List<Emp> emps);
	void update(int id, String name, double salary);
	void delete(int id);
	void search(int id);
	void show();
	
}
