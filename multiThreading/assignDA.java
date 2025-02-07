package multiThreading;

public class assignDA extends Thread {
	
	public void run() {
		System.out.println("Assigning DA...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("DA assigned.");		
	}
}