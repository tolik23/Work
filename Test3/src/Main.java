import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// шаблон дл€ регул€рн выраж-и€ по которому будет поиск
		Pattern pattern = Pattern.compile("test$");
		
		///объект который умеет наход и сравн по задан шаблону pattern
		Matcher matcher = pattern.matcher("gfhfghjgfh#354750646");
		
		//// поиск совпадений - в ответ приход tru или false
		if(matcher.find()) {
			System.out.println("Ќашли!!!");
		}

	}

}
