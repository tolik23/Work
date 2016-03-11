package gfj1;

public class MyThread extends Thread {

	private String mName;
	private boolean mIsFinish = false;
	private MyThread mOtherThread;
	public MyThread(String name) {
		
		mName = name;
	}
public void setOtherThread(MyThread  thread) {
		
		mOtherThread = thread;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++){
			System.out.println("Другой поток...." + mName + "i=" +i);
				if(isInterrupted()){
				break;
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
				System.out.println("Ошибка во сне");
				break;
			}
		
			}
	}
	
	public void finish(){
		interrupt();
	}
}
