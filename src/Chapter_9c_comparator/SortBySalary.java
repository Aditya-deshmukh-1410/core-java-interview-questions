package Chapter_9c_comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getSalary() > o2.getSalary()) {
			return 1;
		}else if(o1.getSalary() < o2.getSalary()) {
			return -1;
		}else {
			return 0;
		}
	}

}
