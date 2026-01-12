package Chapter_3;

class Document{
	Document getDocument() {
		return this;
	}
}

class SalarySlip extends Document{
	@Override
	SalarySlip getDocument() {
		return this;
	}
	
	void printSalarySlip() {
		System.out.println("This is salary slip!");
	}
}

public class CovariantReturnType {
	public static void main(String[] args) {
		
		//covariant return type to return a more specific object from an overridden method
		new SalarySlip().getDocument().printSalarySlip();
		
	}
}
