package multiThreading;

public class threadApp {

	public static void main(String[] args) {
		
		counter obj = new counter();
		
		testThread2 t1 = new testThread2(); // from thread class
		
		// instance of runnable
		testThread runnable = new testThread();
		Thread t2 = new Thread(runnable);
		
		Thread t3 = new Thread (() -> {
			for(int i=0; i<5; i++) {
				obj.incrementCount();
			}
		});
		
		Thread t4 = new Thread (() -> {
			for(int i=0; i<4; i++) {
				obj.incrementCount();
			}
		});
						
//		t1.start();
//		t2.start();
		t3.start();
		t4.start();
		
		try {
//			t1.join();
//			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.getCount());
		System.out.println("Process completed.");
	}

}
