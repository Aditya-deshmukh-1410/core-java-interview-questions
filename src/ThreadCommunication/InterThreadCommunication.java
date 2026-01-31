package ThreadCommunication;

/* Description :
 * This program demonstrates Inter-Thread Communication in Java
 * using the wait() and notify() methods.
 *
 * A shared Message object is used as a communication medium
 * between two threads:
 *
 * 1) Waiting Thread:
 *    - Acquires the lock on the shared object
 *    - Calls wait() and releases the lock
 *    - Resumes execution after receiving notification
 *
 * 2) Notifying Thread:
 *    - Sleeps for 2 seconds
 *    - Acquires the same lock
 *    - Calls notify() to wake up the waiting thread
 *
 * Important Rules:
 * - wait() and notify() must be called inside a synchronized block
 * - Both threads must use the same shared object
 *
 */

class Message{
	String msg;
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		
		Message message  = new Message();  // Shared object
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (message) {
					System.out.println("waiting for msg....");
					try {
						message.wait();  // Thread goes into waiting state
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("got the msg!");
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);  // Delay before sending notification
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (message) {
					System.out.println("sending the msg....");
					message.notify();  // Wakes up waiting thread
				}
			}
		}).start();
		
	}
}


/*

waiting for msg....
--- waits 2 sec----
sending the msg....
got the msg!

*/
