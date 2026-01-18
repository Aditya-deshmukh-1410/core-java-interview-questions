package Chapter_6;

/*
 * Demonstrates commonly used String class methods such as
 * length(), compareTo(), concat(), trim(), replace(), and valueOf().
 * Also shows basic usage of wrapper classes.
 */

public class StringMethodsDemo { 
	public static void main(String[] args) {
		
		String str = "Hello world";
		System.out.println(str.length());
		
		System.out.println(str.compareTo("Hello"));
		
		String s1 = "Java ";
		String s2 = "Programming";
		System.out.println(s1.concat(s2));
		
		String str2 = " Trim empty space ";
		System.out.println(str2.trim());
		
		String s3 = "Hello";
		System.out.println(s3.replace('H', 'X'));
		
		System.out.println(String.valueOf(23)); //convert int to string
		
		//Wrapper class
		
		String string  = "Hello";
		System.out.println(string);
		
		Integer integer  = 100;
		System.out.println(integer);
		
		
		/*
        Output:
         - 11
         - 6
         - Java Programming
         - Trim empty space
         - Xello
         - 23
        */
		
	}

}
