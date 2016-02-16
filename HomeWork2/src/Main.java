import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mas = {10, 22, 78, 152, 69, 8, 14, 36, 45, 19} ;
        int minValue = mas[0];
        int maxValue = mas[0];
        int minI = 0;
        int maxI = 0;
        
        for (int i = 1; i < 10; i++) {
        if (mas[i] < minValue) {
        	minValue = mas[i];
        	minI = i;
           }
        if (mas[i] > maxValue) {
        	maxValue = mas[i];
        	maxI = i;
        }
        }
        System.out.println("min value=" + minValue);
        System.out.println("max value=" + maxValue);
        
        mas[minI] = 0;
        mas[maxI] = 99;
        
        System.out.print("[");
        
        for (int i = 0; i < 10; i++) {
        	if (i < 9) {
        		System.out.print(mas[i] + ", ");	
        	}
        	else {
        		System.out.print(mas[i]);
        	}
        }
        System.out.println("].");
        
        
        
       /////////////////////////
       
        
        float[] mas1 = {2, 3, 5, 7, 6, 5, 7, 3, 7,20};
        
        int nom = 1;
        int kOd=1;
        Arrays.sort(mas1);
        
        for (int i = 0; i < 10; i++) {
		  for (int j = i + 1; j < 10; j++ ) {
             
		      if (mas1[i] == mas1[j]) {
		    	  nom = i;
		    	  kOd++;
		      }
              else if (kOd > 1) {
        	      System.out.println("[" + mas1[nom] + "] - повторений " + kOd);
                  kOd = 1;
        	      
        	      break;
              }
		      break;
		  }
        }
	
	/////////////////////////
        
        int[] mas2 = new int[10];
        Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			mas2[i] = rand.nextInt(100);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();
		
		int x = 0;
		for (int i = 0; i < mas2.length / 2; i++) {
			x = mas2[i];
			mas2[i] = mas2[mas2.length - i - 1];
			mas2[mas2.length - i - 1] = x;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(mas2[i] + " ");
		}
        
	}

}
