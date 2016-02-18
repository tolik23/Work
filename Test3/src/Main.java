import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// шаблон дл€ регул€рн выраж-и€ по которому будет поиск
		String number = "+375         29            2741017";
		number.replace("[\\s]{2,}", " ");
		System.out.println(number);
	Pattern pattern = Pattern.compile("375(17|25|29|33|44)\\d{7}$");
	Matcher matcher = pattern.matcher(number);
		
//		Pattern pattern = Pattern.compile("^\\d{4}\\s[A-Q]{2}-[0-7]$");
		
		//объект который умеет наход и сравн по задан шаблону pattern
//		Matcher matcher = pattern.matcher("5254 FG-5");
		
		// поиск совпадений - в ответ приход tru или false
		if(matcher.find()) {
			System.out.println("Ќашли!!!");
		}

	}

}
