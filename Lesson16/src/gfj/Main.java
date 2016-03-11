package gfj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread thread = new MyThread("Супер поток");
		thread.start();
		MyThread thread2 = new MyThread("Мега поток");
		thread2.start();
		
	
		System.out.println("Главный поток....");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
			System.out.println("Главн поток, Ошибка во сне");
		}
		System.out.println("Хотим остановить");
		thread.finish();
	}

}
