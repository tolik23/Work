import java.util.Scanner;

public class Calc {


	public void menuCalc() throws MyException {
		
		String menuCalc = ("1 - C������� a+b.\n2 - ��������� �-b.\n3 - ��������� a*b.\n4 - ������� a/b.");
		System.out.println(menuCalc);
	
		try {
		switch (scan()) {
		case 1:
			summ();
			break;
		case 2:
			vychet();
			break;
		case 3:
			umnoj();
			break;
		case 4:
			delen();
			break;
			
		default:
			
			throw new MyException("�������� ��������.");
		}
		} catch (Exception e) {
		}
	}
	
		private void summ() {
//	    	Scanner sc = new Scanner(System.in);
//	    	System.out.println("������� ����� a.");
//	    	double a = sc.nextDouble();
//	    	System.out.println("������� ����� b.");
//	    	double b = sc.nextDouble();
			
			ab();
	    	double c;
		c = .getNumbA() + .getNumbB(); 
		System.out.println(c);
			
		}
		
		private void vychet() {
//			Scanner sc = new Scanner(System.in);
//	    	System.out.println("������� ����� a.");
//	    	double a = sc.nextDouble();
//	    	System.out.println("������� ����� b.");
//	    	double b = sc.nextDouble();
	    	
	    	ab();
	    	double c;
		c = .getNumbA() - .getNumbB();  
		System.out.println(c);
		}
		
		private void umnoj() {
//			Scanner sc = new Scanner(System.in);
//	    	System.out.println("������� ����� a.");
//	    	double a = sc.nextDouble();
//	    	System.out.println("������� ����� b.");
//	    	double b = sc.nextDouble();
	    	
	    	ab();
	    	double c;
		c = .getNumbA() * .getNumbB();  
		System.out.println(c);	
		}
		
		private void delen() throws MyException{
//			Scanner sc = new Scanner(System.in);
//	    	System.out.println("������� ����� a.");
//	    	double a = sc.nextDouble();
//	    	System.out.println("������� ����� b.");
//	    	double b = sc.nextDouble();
	    	try {
	    	ab();
	    	double c;
		c = ab().newNumb.getNumbA() / ab().newNumb.getNumbB();  
		System.out.println(c);	
	    	} catch(ArithmeticException e) {
				System.out.println("������� �� ����");
			}
		}
	
    public void ab() {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("������� ����� a.");
//    	int a = sc.nextInt();
//    	System.out.println("������� ����� b.");
//    	int b = sc.nextInt();
    	
    	Numb newNumb = new Numb();

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� a.");
		newNumb.setNumbA(sc.nextDouble());

		System.out.println("������� ����� b.");
		newNumb.setNumbB(sc.nextDouble());
   
    }
	
	
	private int scan() throws MyException {

		int x;

		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				break;
			} else {
				throw new MyException("������� ������������ ��������.");
			}
		}
		return x;

	}
}
