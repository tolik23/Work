package parser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.jar.Attributes;

import org.xml.sax.SAXException;

import com.google.gson.Gson;

import data.Root;

public class ParserGSON implements IParser {

	// сиглтон
	private ParserGSON() {
	}
	private static class ParserGsonSingl{
		private final static ParserGSON instance = new ParserGSON();
	}
	public static ParserGSON getInstance() {
		return ParserGsonSingl.instance;
	}
	
	
	public Root parse() {
		Root root = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("pub.json"));
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
