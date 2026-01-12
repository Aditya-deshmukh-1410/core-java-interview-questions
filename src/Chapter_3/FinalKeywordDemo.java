package Chapter_3;

final class Company{
	
	final String c_name = "xyz";
	final String c_address = "Mumbai";
	
	public final void displayCompInfo() {
		System.out.println("Company name: "+c_name);
		System.out.println("Company address: "+c_address);
	}
}

//class Company1 extends Company{

//  cannot inherit final class!!
//  cannot override the method!!

//}

public class FinalKeywordDemo {
	public static void main(String[] args) {
		
		Company company  = new Company();
		company.displayCompInfo();
		
//  cannot change the value
//	company.c_name = "abc";
		
	}
}
