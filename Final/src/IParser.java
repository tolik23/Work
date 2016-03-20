import java.util.jar.Attributes;

import org.xml.sax.SAXException;

public interface IParser {

	void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException;

}
