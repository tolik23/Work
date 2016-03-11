package gfj;

public class MyThread extends Thread {

	private String mName;
	private boolean mIsFinish = false;
	
	public MyThread(String name) {
		
		mName = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++){
			System.out.println("Другой поток...." + mName + "i=" +i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println("Ошибка во сне");
			}
			if(mIsFinish){
				break;
			}
			}
	}
	
	public void finish(){
		mIsFinish = true;
	}
}
