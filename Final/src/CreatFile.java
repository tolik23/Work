
public class CreatFile {

	public void Thread1() {
	Thread thread = new Thread(runnable); 
	thread.start();
	
	System.out.println("Главный поток....");
	
	}
private static Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for (int i=0; i<100; i++){
				System.out.println("Другой поток....");
				}
		}
	};
	
}
