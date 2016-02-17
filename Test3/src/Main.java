import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// шаблон дл€ регул€рн выраж-и€ по которому будет поиск
		
	
		Pattern pattern = Pattern.compile("^\\d{4}\\s[A-Q]{2}-[0-7]$");
		
		///объект который умеет наход и сравн по задан шаблону pattern
		Matcher matcher = pattern.matcher("+375292741017");
		
		//// поиск совпадений - в ответ приход tru или false
		if(matcher.find()) {
			System.out.println("Ќашли!!!");
		}

	}

}
