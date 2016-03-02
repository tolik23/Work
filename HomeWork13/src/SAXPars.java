import java.util.ArrayList;
import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXPars extends DefaultHandler {
	
	String thisElement = "";
	ElementMy elementMy;
	
	private ArrayList<ElementMy> list = new ArrayList<>();
	
	public ArrayList<ElementMy> getListElementMy() {
		
		return list;
	}
	 
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
		thisElement = qName;
	} 
	 
	@Override 
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
		thisElement = "";
	} 
	 
	@Override 
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		
		if (thisElement.equals("element")) {
			elementMy = new ElementMy();
		}
		if (thisElement.equals("age") && elementMy != null) { 
			elementMy.setAge(new Integer(new String(ch, start, length))); 
		} 
		if (thisElement.equals("id") && elementMy != null) { 
			elementMy.setId(new Long(new String(ch, start, length))); 
		} 
		if (thisElement.equals("isDegree") && elementMy != null) { 
			elementMy.setDegree(new Boolean(new String(ch, start, length))); 
		} 
		if (thisElement.equals("name") && elementMy != null) { 
			elementMy.setName(new String(ch, start, length)); 
		} 
		if (thisElement.equals("surname") && elementMy != null) { 
			elementMy.setSurname(new String(ch, start, length));
			list.add(elementMy);
			elementMy = null;
		}
	} 
}