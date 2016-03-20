import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class ParserGSON implements IParser {

	public Root parse() {
		Root root = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("test.json"));
			Gson gson = new Gson();

			// конвертируем json в root
			root = gson.fromJson(reader, Root.class);
			System.out.println(root.toString());
		} catch (Exception e) {
			System.out.println("GSON Error = " + e.getMessage());
		}
		return root;

	}
}
