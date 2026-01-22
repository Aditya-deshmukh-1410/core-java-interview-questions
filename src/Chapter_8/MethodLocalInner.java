package Chapter_8;

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
