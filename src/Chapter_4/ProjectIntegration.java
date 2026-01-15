package Chapter_4;

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
