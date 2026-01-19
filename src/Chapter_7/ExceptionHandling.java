package Chapter_7;

import java.util.InputMismatchException;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		int n1 = 10,n2 = 0;
		
		try {
			System.out.println(n1/n2);
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
