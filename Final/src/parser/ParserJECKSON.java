package parser;
import java.io.File;
import java.util.jar.Attributes;

import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import data.Root;

public class ParserJECKSON implements IParser {
	
	// сиглтон
		private ParserJECKSON() {
		}
		private static class ParserJecksonSingl{
			private final static ParserJECKSON instance = new ParserJECKSON();
		}
		public static ParserJECKSON getInstance() {
			return ParserJecksonSingl.instance;
		}
	
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