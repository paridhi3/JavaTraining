package multiThreading;

public class orderApp {

	public static void main(String[] args) {
		
		takeOrder t1 = new takeOrder();
		processPayment t2 = new processPayment();
		assignDA t3 = new assignDA();
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Process completed.");
	}

}
