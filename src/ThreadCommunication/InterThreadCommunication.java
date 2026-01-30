package ThreadCommunication;

class Message{
	String msg;
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		
		Message message  = new Message();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (message) {
					System.out.println("waiting for msg....");
					try {
						message.wait();
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
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (message) {
					System.out.println("sending the msg....");
					message.notify();
				}
			}
		}).start();
		
	}
}
