package lesexp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		test(1, 1);
		} catch (Exception e){
			System.out.println("ERROR");
		}
	}

	public static int test(int a, int b) throws ArithmeticException {
		if(a==1 || b==1){
			throw new ArithmeticException();
		}
		return a/b;
	}
}

