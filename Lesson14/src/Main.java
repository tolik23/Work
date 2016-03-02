import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONParser parser = new JSONParser();
		try {
			// инициализируем парсер
			JSONObject obj = (JSONObject) parser.parse(new FileReader("test.json"));
			
			// получ переменную name
			String name = (String) obj.get("name");
			System.out.println("NAME = " + name);
			
			// получ массив об-ов в перем-ой people
			JSONArray jsonArray = (JSONArray) obj.get("people");
			
			for(int i=0; i< jsonArray.size(); i++) {
				
				System.out.println("==========================");
				
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				
				long id = (long) jsonObject.get("id");
				System.out.println("id = " + id);
				
				String nameInner = (String) jsonObject.get("name");
				System.out.println("name = " + nameInner);
				
				String surnameInner = (String) jsonObject.get("surname");
				System.out.println("surname = " + surnameInner);
				
				long age = (long) jsonObject.get("age");
				System.out.println("age = " + age);
				
				boolean isDegree = (boolean) jsonObject.get("isDegree");
				System.out.println("isDegree = " + isDegree);
			}
		} catch(Exception e) {
			System.out.println("JSON Error = " + e.getMessage());
		}
	}

}
