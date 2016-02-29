import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("dsfsdf", "sdfdsfsdf");
		map.put("sfdhgja", "asdgfghf");
		map.put("sdgrfh", "atregczx");
		
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> pair
			   = (Entry<String, String>) iterator.next();
			
			System.out.println(pair.getKey() + " | " + pair.getValue());
		}

	}

}
