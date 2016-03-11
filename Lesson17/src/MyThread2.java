
public class MyThread2 extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			System.out.println("Thread2 run 1");
			
			synchronized(this){
			try {
				wait();
			} catch (InterruptedException ex) {
			}
			System.out.println("Thread 2 run 2");
	}
	}
}
