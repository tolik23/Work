import java.util.Scanner;

public class Calc {


	public void menuCalc() throws MyException {
		String menuCalc = ("1 - Cложение a+b.\n2 - Вычетание а-b.\n3 - Умножение a*b.\n4 - Деление a/b.");
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
			
			throw new MyException("Неверное значение.");
		}
		} catch (Exception e) {
		}
	}
	
	private void summ() {
			Numb temp = new Numb(0,0);
			temp=ab();
	    	double c;
		c = temp.getNumbA() + temp.getNumbB(); 
		System.out.println(c);
			
		}
		
		private void vychet() {
			Numb temp = new Numb(0,0);
			temp=ab();
	    	double c;
		c = temp.getNumbA() - temp.getNumbB();  
		System.out.println(c);
		}
		
		private void umnoj() {
			Numb temp = new Numb(0,0);
			temp=ab();
	    	double c;
		c = temp.getNumbA() * temp.getNumbB();  
		System.out.println(c);	
		}
		
		private void delen() throws MyException{
	    	try {
	    		Numb temp = new Numb(0,0);
				temp=ab();
	    	double c;
		c = temp.getNumbA() / temp.getNumbB();  
		System.out.println(c);	
	    	} catch(ArithmeticException e) {
				System.out.println("Деление на ноль");
			}
		}
	
    public Numb ab() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Введите число a.");
    	double a = sc.nextDouble();
    	System.out.println("Введите число b.");
    	double b = sc.nextDouble();
    	
    	Numb newNumb = new Numb(a,b);
        return newNumb;
    }
	
	
	private int scan() throws MyException {

		int x;

		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				break;
			} else {
				throw new MyException("Введено неправильное значение.");
			}
		}
		return x;

	}
}
