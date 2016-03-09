
public class Main {

	public static void main(String[] args) {

		String text = new String("Material design is guided by print-based design elements – such as typography, grids,"
				+ " space, scale, color, and imagery – to create hierarchy, meaning, and focus that immerse the user in the"
				+ " experience. Material design adopts tools from the field of print design, like baseline grids and"
				+ " structural templates, encouraging consistency across environments by repeating visual elements, structural"
				+ " grids, and spacing across platforms and screen sizes. These layouts scale to fit any screen size, which"
				+ " simplifies the process of creating scalable apps.");
		String[] array = text.split(" ");
		int i = 0;
		int j = 0;

		while (true) {
			if (i == array.length) {
				j++;
				i = 0;
				if (j == array.length) {
					break;
				}
			}

			if (array[i].length() == j + 1) {
				System.out.println(array[i]);
			}
			i++;
		}

	}

}
