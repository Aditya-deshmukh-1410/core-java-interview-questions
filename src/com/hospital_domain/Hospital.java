/*
 * Project: Hospital Domain Abstraction
 * Topic: Abstraction & Inheritance in Java
 * Concepts Used:
 * - Abstract Class
 * - Method Overriding
 * - Polymorphism
 * - Encapsulation
 */



package com.hospital_domain;

abstract class Person {
	
	private int id;
	private String name;
	private int age;
	private String address;
	private int constact;
	
	
	abstract void personRole();
	
	public void register() {
		System.out.println("registered person");
	}
	
	public void updateInfo() {
		System.out.println("updated details");
	}
	
	public void viewInfo() {
		System.out.println("view details");
	}
	
	public void deleteInfo() {
		System.out.println("deleted info");
	}
}


class Patient extends Person{
	
	private int p_id;
	private String p_name;
	private String bloodGrp;
	private boolean admitted;
	private double bill;
	

	@Override
	void personRole() {
		System.out.println("Role: Patient");
	}
	
	public void patientInfo() {
		System.out.println("registered patient");
	}
	
	public void patientUpdateInfo() {
		System.out.println("patient updated details");
	}
	
	public void viewPatientInfo() {
		System.out.println("patient details");
	}
	
	public void dischargePatient() {
		System.out.println("patient is discharged");
	}
	
}

class Doctor extends Person{

	private int d_id;
	private String d_name;
	private String specialization;
	private boolean available;
	private double salary;
	
	@Override
	void personRole() {
		System.out.println("Role: Doctor");
	}
	
	public void doctorInfo() {
		System.out.println("registered doctor");
	}
	
	public void doctorSpecialization() {
		System.out.println("specialization of doctor");
	}
	
	public void doctorPrescribtion() {
		System.out.println("doctor precribed medicine");
	}
	
	public void doctorAvailable() {
		System.out.println("doctor is available");
	}
}

public class Hospital{
	public static void main(String[] args) {
		
		Person p1 = new Doctor();
		p1.personRole();
		
		Person p2 = new Patient();
		p2.personRole();
		
		Patient patient  = new Patient();
		patient.dischargePatient();
		
		Doctor doctor  = new Doctor();
		doctor.doctorAvailable();
		
		
	}
}

/*
 * Output:
  	- Role: Doctor
	- Role: Patient
	- patient is discharged
	- doctor is available
 */
