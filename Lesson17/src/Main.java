
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread2 t2 = new MyThread2();
		MyThread1 t1 = new MyThread1(t2);
		
		System.out.println("start");
		t1.start();
		t2.start();
		
	}

}
