package parser;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.jar.Attributes;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import data.Goods;
import data.Root;


public class ParserSAX extends DefaultHandler implements IParser {
	
	 String thisElement = "";
	 Root root;
	 Goods goods;
	
	public ParserSAX() {
		this.root = new Root();
	}
	

	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
		thisElement = qName;
	} 
	 

	
	

	public void characters(char[] ch, int start, int length) throws SAXException {
		
		if(thisElement.equals("name") && goods == null) {
			
			root.setName(new String(ch, start, length));
		}
		
		if(thisElement.equals("location") && goods == null) {
			
			root.setLocation(new String(ch, start, length));
		}
		
		if(thisElement.equals("emails") && goods == null) {
			
			root.getEmails().add(new String(ch, start, length));
		}
		
		if(thisElement.equals("goods") && goods == null) {
			
			goods = new Goods();
		}
		
		if(thisElement.equals("id") && goods != null) {
			
			goods.setId(new Integer(new String(ch, start, length)));
		}
		
		if(thisElement.equals("name") && goods != null) {
			
			goods.setName(new String(ch, start, length));
		}
		
		if(thisElement.equals("country") && goods != null) {
			
			goods.setCountry(new String(ch, start, length));
		}
		
		if(thisElement.equals("sort") && goods != null) {
			goods.setSort(new String(ch, start, length));
		}
		
		if(thisElement.equals("year") && goods != null) {
			
			goods.setYear(new String(ch, start, length));
		}
		
		if(thisElement.equals("price") && goods != null) {
			
			goods.setPrice(new Integer(new String(ch, start, length)));
		}
		
		if (thisElement.equals("visible") && goods != null) {
			
			goods.setVisible(new Boolean(new String(ch, start, length)));
			
			root.getGoods().add(goods);
			
			goods = null;
			
		}
			
	} 

	public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
		thisElement = "";
	}
	
	
	@Override
	public Root parse() {
	
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser parser = factory.newSAXParser();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParserSAX parserSAX = new ParserSAX();
		
		return parserSAX.root;
	}

}
