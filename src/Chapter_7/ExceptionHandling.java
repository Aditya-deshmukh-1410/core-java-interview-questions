package Chapter_7;
/*
 * Demonstrates exception handling using :
     - try and multiple catch blocks,
     - finally block in Java.
 */

import java.util.InputMismatchException;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		int n1 = 10,n2 = 0;
		
		try {
			System.out.println(n1/n2);  // exception  occurred
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Program ended!!");
		}
	}
}

/*
 * Output:
 
  java.lang.ArithmeticException: / by zero
  at Chapter_7.ExceptionHandling.main(ExceptionHandling.java:15)
  Program ended!!
 
 */
