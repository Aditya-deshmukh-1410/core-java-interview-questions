/*
 * Interview Topic: Containment (Has-A Relationship)
 * Source: Core Java Assignment
 * Concepts: Object containment, Has-A relationship, toString()
 */

package com.containment;

class Hobbies{
	String hobby1;
	String hobby2;
	
	public Hobbies(String hobby1, String hobby2) {
		super();
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
	}

	@Override
	public String toString() {
		return "Hobbies [hobby1=" + hobby1 + ", hobby2=" + hobby2 + "]";
	}
}


class Address{
	String address1;
	String address2;
	
	public Address(String address1, String address2) {
		super();
		this.address1 = address1;
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + "]";
	}
}


class Employee{
	int id;
	String name;
	Hobbies hobbies ;
	Address address ;
	
	public Employee(int id, String name, Hobbies hobbies, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
}


public class Containment {
	public static void main(String[] args) {
		
		Hobbies hobbies  = new Hobbies("Dance", "Sing");
		
		Address address = new Address("Mumbai", "Pune");

		// Containment: when one object contain another object as an attribute it is called as containment.shows (Has-A) relation.
		Employee employee  = new Employee(101, "Naman", hobbies, address);
		
		System.out.println(employee.hobbies.hobby1);
		System.out.println(employee.address.address2);
	}
}

/*
 Output:
 - Dance
 - Pune
*/
