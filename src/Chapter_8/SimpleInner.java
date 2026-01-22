package Chapter_8;

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
