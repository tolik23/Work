import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mas[] = new int[10];

		vvod(mas);
		print(mas);
		sortVybor(mas);
		print(mas);
		ChetNumb(mas);

	}

	public static void vvod(int mas[]) {
											

		for (int i = 0; i < mas.length; i++) {
			
			System.out.println("������� ��������  " + i + ":");
			
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				mas[i] = sc.nextInt();
			} 
			else {
				System.out.println("�������� ��������, ������� ��� ���.");
				i--;
			}
		}
	}

	public static void print(int mas[]) {  // �����

		System.out.println();
		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + " | ");
		}
	}
	
	public static void sortVybor(int mas[]) {	// ���������� �������
		
		for (int i = 0; i < mas.length; i++) {
	        
	        int min = mas[i];
	        int minI = i; 
	        
	        for (int j = i+1; j < mas.length; j++) {
	            if (mas[j] < min) {
	                min = mas[j];
	                minI = j;
	            }
	        }
	        if (i != minI) {
	            int x = mas[i];
	            mas[i] = mas[minI];
	            mas[minI] = x;
	        }
	     }
		
	}
	
	
	public static void sortBubble(int mas[]) { // ���������� ���������

		for (int i = mas.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (mas[j] > mas[j + 1]) {
					int y = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = y;
				}
			}
		}

	}
	

	public static void sortArray(int mas[]){	// ���������� ������� sort() Arrays
		
		Arrays.sort(mas);
	}

	public static void ChetNumb(int mas[]) { // ����� ������ �����
												
		System.out.println();
		System.out.println("������ �������� �������: ");
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 != 1) {
				System.out.print(mas[i] + " | ");
			}
		}
	}

}
	