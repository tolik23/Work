

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser parser = factory.newSAXParser(); 
		ParserSAX saxp = new ParserSAX(); 
		 
		parser.parse(new File("pub.xml"), saxp);
		
		
		Root root;
		System.out.println(root.toString());
		
//		Menu menu = new Menu();
//		menu.mainMenu();
	}

}
