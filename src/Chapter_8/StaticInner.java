package Chapter_8;

/*
 * Description:
 * This program demonstrates a static inner class in Java.
 * A static inner class can access only the static members
 * of the outer class.
 * The static inner class can have both static and non-static methods
 * and does not require an object of the outer class to be instantiated.
 */

import Chapter_8.Outer2.Inner2;

class Outer2{
	
	static private  int b = 20;
	
	static class Inner2{
		void innerMeth1() {
			System.out.println("Inside inner meth: "+b);
		}
		
		static void innerMeth2() {
			System.out.println("Inside inner meth2: "+b);
		}
		
	}
}

public class StaticInner {
	public static void main(String[] args) {
		
		Outer2.Inner2 inner  = new Outer2.Inner2();
		inner.innerMeth1(); 
		Inner2.innerMeth2();// accessing through class name
		
	}
}

 /* Output:
 * Inside inner meth: 20
 * Inside inner meth2: 20
 */
