package Chapter_7;

/*
 * Demonstrates a user-defined checked exception in Java.
 * An invalid operation causes a custom exception
 * which is handled in the main method.
 */

class InvalidOperationException extends Exception{
	public InvalidOperationException() {
		System.out.println("invalid operation....");
	}
}


public class UserDefinedException {
	
	public static void calculator(int n1,int n2,String operation) throws InvalidOperationException {
		
		if(operation.equals("+")) {
			System.out.println(n1+n2);
		}else if(operation.equals("-")) {
			System.out.println(n1-n2);
		}else if(operation.equals("*")) {
			System.out.println(n1*n2);
		}else if(operation.equals("/")) {
			try {
				System.out.println(n1/n2);
			}catch (ArithmeticException e) {
				System.out.println(e);
			}
		}else {
			throw new InvalidOperationException();  //exception
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			calculator(10, 0, "sjdbcn");      //exception 
		} catch (InvalidOperationException e) {
			e.printStackTrace();
		}finally {
			System.out.println("program ended....");
		}
	}
}

/*
 * Output:
 
invalid operation....
Chapter_7.InvalidOperationException
	at Chapter_7.UserDefinedException.calculator(UserDefinedException.java:33)
	at Chapter_7.UserDefinedException.main(UserDefinedException.java:41)
program ended....

 */
