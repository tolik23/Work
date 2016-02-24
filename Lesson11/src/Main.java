import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//		int[] array = new int[5];
//		int a = array[6];
//	
//	int b = 1/0;
//		
//} catch(ArithmeticException e) {
//	System.out.println("Main main() e = " + e.toString());
//}  catch(IndexOutOfBoundsException e) {
//	System.out.println("Main main() e = " + e.toString());
//}
		Integer a =0, b=0;
		double c;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Введите  а");
			a= Integer.valueOf(sc.nextLine());
			System.out.println("Введите  в");
			b=Integer.valueOf(sc.nextLine());
			c = a/b;
			System.out.println(c);
		} catch(NumberFormatException e) {
			System.out.println("Неверный формат");
		} catch(ArithmeticException e) {
			System.out.println("Деление на ноль");
		}
		
		
//		try {
//			int[] array = new int[5];
//			int a = array[6];
//		
//		int b = 1/0;
//		} catch(ArithmeticException e) {
//		System.out.println("Main main() e = " + e.toString());
//	}  catch(IndexOutOfBoundsException e) {
//		System.out.println("Main main() e = " + e.toString());		
//	} catch(Exception e) {
//		System.out.println("Main main() e = " + e.toString());
//	}  finally {
//		System.out.println("finnaly");
//	}
	}

}
