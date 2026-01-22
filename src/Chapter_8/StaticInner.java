package Chapter_8;

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
