package gfj1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread thread = new MyThread("Супер поток");
		
		MyThread thread2 = new MyThread("Мега поток");
		
		thread.setOtherThread(thread);
		thread2.setOtherThread(thread2);
		thread.start();
		thread2.start();
		
//	
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Главный поток....");
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException ex) {
//			System.out.println("Главн поток, Ошибка во сне");
//		}
//		System.out.println("Хотим остановить");
//		thread.finish();

	
	
	}
	

}
