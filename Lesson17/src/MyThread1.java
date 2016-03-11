
public class MyThread1 extends Thread {

	private MyThread2 mMyThread2;
	public MyThread1(MyThread2 thread2)
	
	{
		
		mMyThread2 = thread2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			System.out.println("Thred run 1");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Thred run 1");
			synchronized (mMyThread2){
			mMyThread2.notify();
	
			}

	}
}
