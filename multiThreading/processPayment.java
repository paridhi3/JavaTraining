package multiThreading;

public class processPayment extends Thread{
	
	public void run() {
		System.out.println("Processing payment...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Payment recieved.");		
	}
}
