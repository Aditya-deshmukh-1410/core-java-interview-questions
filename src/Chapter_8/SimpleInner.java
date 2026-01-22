package Chapter_8;

/*
 * Description:
 * This program demonstrates a simple non-static inner class in Java.
 * The Inner class is defined inside the Outer class and can directly
 * access the private members of the outer class.
 * An object of the outer class is required to create an instance
 * of the inner class.
 */


class Outer{
	
	private int a = 10;
	
	class Inner{
		void innerMeth() {
			System.out.println("Inside inner Method: "+a);
		}
	}
}

public class SimpleInner {
	public static void main(String[] args) {
		
		Outer outer  = new Outer();  // create object of outer class first
		Outer.Inner inner  = outer.new Inner(); // create the object of inner class
		
		inner.innerMeth();
	}
}

 /* Output:
 * Inside inner Method: 10
 */
