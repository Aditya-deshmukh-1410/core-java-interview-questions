/*
 * Topic: Protected Access Modifier
 * 
 * Description:
 * Demonstrates accessing a protected method
 * from another package using inheritance.
 */

package Chapter_2;

/*
 * Question -> create com.hospital.staff.doctor.salary.Salary
 * 			   - create protected void CalSalary(double Amt,double tax)
 * 			   - access it:-  1)By Direct Access	
 * 							  2)By Importing
*/


public class Salary {
	protected void CalSalary(double Amt,double tax) {
		System.out.println(Amt-tax);
	}
}
