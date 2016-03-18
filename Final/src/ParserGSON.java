import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

import gson.Root;

public class ParserGSON {


	public Root parse () {
	try {
		BufferedReader reader = 
				new BufferedReader(new FileReader("test.json"));
		Gson gson = new Gson();
		
		// конвертируем json в root
		Root root = gson.fromJson(reader, Root.class);
		System.out.println(root.toString());
	}catch(Exception e) {
		System.out.println("GSON Error = " + e.getMessage());
	}
	
	}
}
