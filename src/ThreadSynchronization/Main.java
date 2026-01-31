package ThreadSynchronization;

/* Description :
 * This program demonstrates Thread Synchronization in Java using the
 * synchronized keyword.
 
 * A shared resource (Calc class) contains a synchronized method `count()`.
 * Multiple threads access this method, but synchronization ensures that
 * only one thread executes the method at a time.
 
 * Two threads are created:
 * 1) Thread1 prints multiples of 5
 * 2) Thread2 prints multiples of 25
 
 * The program also demonstrates:
 * - Thread naming
 * - Thread priority
 * - Current thread information
 *
 */

// Shared resource class
class Calc{

	// Synchronized Method
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
		
	 Calc calc  = new Calc();  // Shared object
	 
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


/*
Output:

Thread Multiple-of-5 | Priority 10
5
10
15
20
25
Thread Multiple-of-25 | Priority 1
25
50
75
100
125

*/

