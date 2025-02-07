package multiThreading;

public class takeOrder extends Thread{
	
	public void run() {
		System.out.println("Taking Order...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Order taken.");		
	}
}
