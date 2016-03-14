import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt);
	    Thread t2 = new Thread(mt);
	     
	    
System.out.println("Для запуска введите start");
		
		Scanner scanner = new Scanner (System.in);
		
		do {
		
			if(scanner.nextLine().equals("start")) {
			
				t1.start();
			
				t2.start();
				
				break;
			
			} else {
			
				System.out.println("Не верно, введите start");
			}
			
		} while(true);
		
		 
	}
	
	public static synchronized void print10() {
		        
	            int kk=1;
	            for(int i=1;i<=10;i++){
	            System.out.print(Thread.currentThread().getName());    
	            for (int j=1;j<=10;j++){
	            System.out.print(" "+(kk++)+" ");
	            }
	            System.out.println();
	        }
	    }

}
