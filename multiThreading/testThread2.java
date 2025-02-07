package multiThreading;

public class testThread2 extends Thread{
	
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running (thread class): "+Thread.currentThread().getName());		
	}
	
}
