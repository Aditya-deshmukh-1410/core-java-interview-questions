package Chapter_3;

class Ceo{
	public void getRules() {
		System.out.println("Ceo rules...");
	}
}

class Manager extends Ceo{
	@Override
	public void getRules() {
		System.out.println("Manager rules...");
	}
}

class Accountant extends Manager{
	@Override
	public void getRules() {
		System.out.println("Accountant rules...");
	}
}

class Employeee extends Ceo{
	@Override
	public void getRules() {
		System.out.println("Employee rules...");
	}
}


public class InheritanceTypes {
	public static void main(String[] args) {
		Employeee emp = new Employeee();
		emp.getRules();
		
		Accountant accountant = new Accountant();
		accountant.getRules();
		
		Manager manager  = new Manager();
		manager.getRules();
		
		Ceo ceo  = new Ceo();
		ceo.getRules();
	}
}

/*
==================== Inheritance Hierarchy ====================

  Single Inheritance:
    	CEO
     	 |
     	 v
      Employee
      

  Multilevel Inheritance:
        CEO
     	 |
     	 v
  	  Manager
      	 |
         v
 	 Accountant
 	 

  Hierarchical Inheritance:
          CEO
        /     \
       v       v
   Employee  Manager
      	        |
                v
 	        Accountant

===============================================================
*/

