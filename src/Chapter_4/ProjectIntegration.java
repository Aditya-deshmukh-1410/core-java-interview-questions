package Chapter_4;

/*
 FLOW OF EXECUTION – PROJECT OVERVIEW

 1. SRS (Interface)
    - Defines the contract.
    - Declares common operations: add, update, delete, show.

 2. ProjectManager (Abstract Class)
    - Implements SRS.
    - Provides base implementations.
    - Acts as a middle layer for future common logic.

 3. TeamLead
    - Extends ProjectManager.
    - Handovers the task to Developers.

 4. Developer Classes
    - BackendDeveloper → add()
    - FrontendDeveloper → update()
    - SeniorDeveloper → delete()
    - JuniorDeveloper → show()
    - Demonstrates method overriding.

 5. main() Execution
    - Objects are created.
    - Methods are called.

 CONCEPTS USED:
 - Interface
 - Abstract class
 - Inheritance
 - Method overriding
*/

public class ProjectIntegration {
	public static void main(String[] args) {
		
		BackendDeveloper developer1 = new BackendDeveloper();
		developer1.add();
		
		FrontendDeveloper developer2 = new FrontendDeveloper();
		developer2.update();
		
		SeniorDeveloper developer3  = new SeniorDeveloper();
		developer3.delete();
		
		JuniorDeveloper developer4 = new JuniorDeveloper();
		developer4.show();
		
	}

}
