package Chapter_3;

class Bank{
	public double getRateInterest() {
		return 4.5;
	}
}

class Axis extends Bank{
	@Override
	public double getRateInterest() {
		return 3.7;
	}
}

class ICICI extends Bank{
	@Override
	public double getRateInterest() {
		return 3.8;
	}
}

class HDFC extends Bank{
	@Override
	public double getRateInterest() {
		return 4.0;
	}
}

class SBI extends Bank{
	@Override
	public double getRateInterest() {
		return 4.3;
	}
}



public class DynamicMethodDispatch {
	public static void main(String[] args) {
		
		Bank bank ;  //parent reference
		bank = new Bank(); 
		System.out.println("Rate interest of Bank: "+bank.getRateInterest());
		
		bank = new Axis();  //child object
		System.out.println("Rate interest of Axis: "+bank.getRateInterest());
		
		bank = new HDFC();
		System.out.println("Rate interest of HDFC: "+bank.getRateInterest());
		
		bank = new ICICI();
		System.out.println("Rate interest of ICICI: "+bank.getRateInterest());
		
		bank = new SBI();
		System.out.println("Rate interest of SBI: "+bank.getRateInterest());
	}
}
