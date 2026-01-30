package ThreadSynchronization;

class Calc{
	synchronized void count(int n) {
		
		System.out.println("Thread "+Thread.currentThread().getName()+"| Priority "+Thread.currentThread().getPriority());
		
		for(int i= 1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread{
	
	Calc c;
	
	public Thread1(Calc c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		c.count(5);
	}
	
}

class Thread2 extends Thread{
	
	Calc c;
	
	public Thread2(Calc c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		c.count(25);
	}
	
}

public class Main{
	public static void main(String[] args) {
		
	 Calc calc  = new Calc();
	 
	 Thread1 thread1  = new Thread1(calc);
	 Thread2 thread2  = new Thread2(calc);
	 
	 thread1.setName("Multiple-of-5");
	 thread2.setName("multiple-of-25");
	 
	 thread1.setPriority(Thread.MAX_PRIORITY);
	 thread2.setPriority(Thread.MIN_PRIORITY);
	 
	 
	 thread1.start();
	 thread2.start();
	}
}

