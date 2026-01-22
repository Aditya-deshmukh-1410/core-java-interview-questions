package Chapter_8;

/*
 * Description:
 * This program demonstrates the use of anonymous inner classes in Java.
 * Anonymous inner classes are used to provide implementations of interfaces
 * at the time of object creation without defining separate classes.
 * Here, Salary, Bonus, and Tax interfaces are implemented anonymously
 * to calculate the final salary.
 */


public class AnonymousInner {

	public double calFinal(Salary salary , Bonus bonus , Tax tax ) {
		return salary.calSal(0)+bonus.calBonus(0)-tax.calTax(0);
	}
	
	public static void main(String[] args) {
		
		AnonymousInner anonymous = new AnonymousInner();
		
		System.out.println(
				
				anonymous.calFinal(new Salary() {
					@Override
					public double calSal(double salary) {
						return 25000;
					}
				},
				new Bonus() {
					@Override
					public double calBonus(double bonus) {
						return 5000;
					}
				}, 
				new Tax() {
					@Override
					public double calTax(double tax) {
						return 3000;
					}
				})
			);
	}
}

 /* Output:
 * 27000.0
 */
