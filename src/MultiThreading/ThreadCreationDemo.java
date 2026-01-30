package MultiThreading;

public class ThreadCreationDemo extends Thread{
	
	//1st method!
	@Override
	public void run() {
		System.out.println("thread1 is running...");    
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
				System.out.println("thread3 is running.....");
			}
		}).start(); 
	}
}
