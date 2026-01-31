package MultiThreading;

/*
 * Description :
 * This program demonstrates three different ways to create and start
 * threads in Java using the Thread class and Runnable interface.
 *
 * 1) By extending the Thread class and overriding the run() method.
 * 2) By creating an anonymous class that extends Thread.
 * 3) By implementing the Runnable interface using an anonymous class.
 *
 */


public class ThreadCreationDemo extends Thread{
	
	//1st method!
	@Override
	public void run() {
		System.out.println("thread1 is running....");    
	}

	public static void main(String[] args) {
		ThreadCreationDemo thread1  = new  ThreadCreationDemo();
		Thread thread  = new Thread(thread1);
		thread.start();
		
		//2nd method
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("thread2 is running....");
			}
		}.start();
		
		//3rd method
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread3 is running....");
			}
		}).start(); 
	}
}

/*
Output:
thread1 is running....
thread2 is running....
thread3 is running....
*/
