package Chapter_7;

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
			throw new InvalidOperationException();
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			calculator(10, 0, "sjdbcn");
		} catch (InvalidOperationException e) {
			e.printStackTrace();
		}finally {
			System.out.println("program ended....");
		}
	}
	
	
	
}
