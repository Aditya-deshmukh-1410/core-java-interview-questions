package com.access_modifiers;

public class Main2 {
	public static void main(String[] args) {
		
		Main main  = new Main();
		
		System.out.println(main.a);
		System.out.println(main.c);
		System.out.println(main.d);
		
	}
}


/* Output:

- Public
- Protected
- Default
*/


// Different Package

/* import com.access_modifiers.Main;

public class Demo extends Main{
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		System.out.println(demo.a);
		System.out.println(demo.c);
	
	}
  }
  
  Output:
  - Public 
  - Protected
  
*/

