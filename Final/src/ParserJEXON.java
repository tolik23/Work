import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ParserJEXON implements IParser {

	public Root parse() {
		Root root = null;
		
		try {

			File jsonFile = new File("pub.json");
			ObjectMapper mapper = new ObjectMapper();

			root = mapper.readValue(jsonFile, Root.class);
			System.out.println(root.toString());
		} catch (Exception e) {
			System.out.println("JECKSON Error = " + e.getMessage());
		}
		
		return root;
	}
}