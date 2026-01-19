package Chapter_7;

/*
 * Demonstrates exception propagation in Java.
 * An exception thrown in one method is passed
 * to the calling method until it is handled.
 */

public class ExceptionPropagation {
	
	public static void divide(int n1, int n2) {
		
		if(n2==0){
			throw new ArithmeticException(); 
		}else{
			System.out.println(n1/n2);
		}
		
	}
	
	public static void calculator(int n1,int n2,String operation) {
		
		if(operation.equals("/")) {
			divide(n1, n2);
		}
	}
	
	public static void main(String[] args) {
		
		try {
			calculator(10, 0, "/");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
/*
 * Output:
 * java.lang.ArithmeticException
 */

