/*
 * Topic: Access Modifiers in Java
 * Demonstrates:
 * - public
 * - private
 * - protected
 * - default access
 * 
 * Scope  across:
 * - Same class
 * - Same package
 * - Different package
 */


package com.access_modifiers;

public class Main {
	
	public String a = "Public";
	private String b = "Private";
	protected String c = "Protected";
	String d = "Default";
	
	public static void main(String[] args) {
		Main main  = new Main();
		
		System.out.println(main.a);
		System.out.println(main.b);
		System.out.println(main.c);
		System.out.println(main.d);
		
	}
}


/* Output:
 
  - Public
  - Private
  - Protected
  - Default
*/