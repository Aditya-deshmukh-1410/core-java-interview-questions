package Chapter_5;

/*
 * Demonstrates the use of static imports and
 * autoboxing and unboxing with wrapper classes.
 */

import static java.lang.Math.*; 
import static java.lang.System.*;

public class StaticImportAndBoxingDemo {
	public static void main(String[] args) {
		

        // Static import usage
		out.println(sqrt(16));
		out.println(PI);
		
		//Auto-boxing 
		
		int a = 10;
		Integer integer  = Integer.valueOf(a);
		System.out.println(integer);
		
		Integer integer2  = a;
		System.out.println(integer2);
		
		//Auto-unboxing
		
		int x = integer2;
		System.out.println(x);
		
	}

}
