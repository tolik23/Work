package les131;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document dom = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse("test.xml");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		Element root = dom.getDocumentElement();
		System.out.println("TAG 1 = " + root.getTagName());
		
		NodeList nameNodeList = root.getElementsByTagName("name");
		Node nameNode = nameNodeList.item(0);
		System.out.println("TAG 2 = " + nameNode.getNodeName());
		
		// 1 способ
		String name = nameNode.getFirstChild().getNodeValue();
		System.out.println("TAG 2 VALUE = " + name);
		// 2 способ
		String name2 = nameNode.getTextContent();
		System.out.println("TAG 2 VALUE = " + name2);
		
		NodeList peopleNodeList = root.getElementsByTagName("people");
		Node peopleNode = peopleNodeList.item(0);
		System.out.println("TAG 3 = " + peopleNode.getNodeName());
		
		NodeList elementNodeList = peopleNode.getChildNodes();
		
		List<ElementMy> listMy = new ArrayList<>();
		
		for(int i=0; i < elementNodeList.getLength(); i++){
			
			Node node = elementNodeList.item(i);
			if(node.getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			ElementMy elementMy = new ElementMy();
			
			Element element = (Element) node;
			
			//name
			NodeList nameNodeListEl = element.getElementsByTagName("name");
			Node namElementEl = nameNodeListEl.item(0);
			String peopleName = namElementEl.getFirstChild().getNodeValue();
			System.out.println("NAME = " + peopleName);
			elementMy.setName(peopleName);
			
			//age
			String agePeople = element.getElementsByTagName("age").item(0).getTextContent();
			System.out.println("AGE = " + agePeople);
			elementMy.setAge(Integer.valueOf(agePeople));
			
			/// isDegree
			String isDegreePeople = element.getElementsByTagName("isDegree").item(0).getTextContent();
			System.out.println("isDegree = " + isDegreePeople);
			elementMy.setDegree(Boolean.valueOf(isDegreePeople));
			// запис эл-нт в массив
			listMy.add(elementMy);
			
		}
		
		System.out.println("Final array = " + listMy);
	}

}
