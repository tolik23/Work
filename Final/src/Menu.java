import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Menu {

	public void mainMenu() {

		while (true) {
			String mainMenu = "1 - Загрузить файл xml.\n2 - Загрузить файл json, использовать парсер .\n0 - выход. ";
			System.out.println(mainMenu);
			switch (scanKay()) {
			case 1:
				fileXml();
				break;
			case 2:
				fileJsonGson();
				break;
			case 3:
				fileJsonJexon();
				break;
			case 0:
				return;
			}
		}
	}
	
	public final String LINK_XML = "http://kiparo.ru/t/pub.xml";
	public final String LINK_JSON = "http://kiparo.ru/t/pub.json";
	
	
	
      public void jecksonPars()  {
		// TODO Auto-generated method stub
	
        try {
        	
        File jsonFile = new File("pub.json");
	    Root root = null;
		
	    ObjectMapper mapper = new ObjectMapper();
            
	    root = mapper.readValue(jsonFile, Root.class);
            System.out.println(root.toString());
        } catch (Exception e) {
        	System.out.println("JECKSON Error = " + e.getMessage());
        }
	}
}
