

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		

		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser = null;
		
		
		try {
			
			parser = factory.newSAXParser();
			
		} catch (ParserConfigurationException | SAXException e) {
		
			e.printStackTrace();
		} 
		
		SAXPars parser1 = null; 
		 
		try {
			
			parser1 = new SAXPars();
			
			parser.parse(new File("test.xml"), parser1);
			
		} catch (SAXException | IOException e) {
			
			e.printStackTrace();
		}
		
		List<ElementMy> list = new ArrayList<>(parser1.getListElementMy());
		
		for(ElementMy el: list) {
			
			System.out.println(list);
		}
		
	}
}
