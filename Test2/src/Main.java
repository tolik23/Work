import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Figure figure, figure2, figure3;
		
		figure = new Kvadr(5);
		int s = figure.area();
		
		figure2 = new Prm(5, 9);
		int s2 = figure2.area();
		
		figure3 = new Trg(5, 9);
		int s3 = figure3.area();
		
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		///////////

		Random rand = new Random();

		int[] mas1 = new int[5];
		for (int i = 0; i < 5; i++) {
			mas1[i] = rand.nextInt(100);
		}
		int[] mas2 = new int[3];
		for (int i = 0; i < 3; i++) {
			mas2[i] = rand.nextInt(100);
		}
		int[] mas3 = new int[11];
		int[] masX = { 0, 1, 2 };

		System.arraycopy(mas1, 0, mas3, 0, mas1.length);
		System.arraycopy(mas2, 0, mas3, mas1.length, mas2.length);
		System.arraycopy(masX, 0, mas3, mas1.length + mas2.length, masX.length);

		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 11; i++) {
			System.out.print(mas3[i] + " ");
		}

	}

}
