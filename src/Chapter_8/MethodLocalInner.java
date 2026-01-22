package Chapter_8;

/*
 * Description:
 * This program demonstrates a method-local inner class in Java.
 * The inner class is defined inside a method and is accessible
 * only within that method.
 * A method-local inner class can access final or effectively final
 * variables of the enclosing method or class.
 */

class A{
	final int x = 30;
	void meth() {
		class Inner3{
			void localMeth() {
				System.out.println("Inside the localMeth: "+x);
			}
		}
		
		Inner3 inner3  = new Inner3();
		inner3.localMeth();
	}
}

public class MethodLocalInner {
	public static void main(String[] args) {
		
		A a  = new A();
		a.meth();
	}

}

 /* Output:
 * Inside the localMeth: 30
 */
