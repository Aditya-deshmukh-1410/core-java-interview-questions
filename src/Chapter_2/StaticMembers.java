/*
 * Topic: Static Members in Java
 * Concepts Used:
 *  - static variables
 *  - static methods
 *  - Class-level access
 */

package Chapter_2;

class Company{
	
	static String c_name = "Google";
	static String c_address = "Banglore";
	
	public  static void displayCompanyInfo() {
		System.out.println("Company name :"+ c_name);
		System.out.println("Company address:"+ c_address);
	}
	
}

public class StaticMembers {
	public static void main(String[] args) {
		
        // Calling static method using class name
		Company.displayCompanyInfo();
	}
}

/*
 * Output:
 * Company name: Google
 * Company address: Banglore
 */
