import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		long timeStart = System.nanoTime();
//		 int[] mas = {7, 5, 7, 18, 5, 3, 3, 20, 18, 20, 1};
//		 Arrays.sort(mas);
//	
//		 int x=0;
//		 for (int i=0; i<mas.length; i++){
//			if (mas[i] == mas[i+1]) {
//				i++;}
//			else{
//				x = mas[i];
//				break;
//			}
//			
//		 }
//		 System.out.println(x);
//		 System.out.print(System.nanoTime()-timeStart);
	
	/////////////////////////////
		 
//		 int[] mas1 = {7, 5, 7, 18, 5, 3, 3, 20, 18, 20, 1};
//		 
//		 int res = 0;
//		 for(int i=0; i<mas1.length;i++){
//		 res = res ^ mas1[i];
//		 }
//		 System.out.println(res);
//		 System.out.print(System.nanoTime()-timeStart);
		
		int a = 555;
		
		int d= a%10;
		int c = (a/10)%10;
		int b = a/100;
		if (((b==c)&&(c==d)) || ((c==b+1)&&(d==c+1))) {
			System.out.println("Happy");
		}
		else {
			System.out.println("Not Happy");
		}
		
		
		
	}

}



