import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	 public static void main(String[] args) {
	       

	        String str = "hellowoooorld";
	        String result = "";
	 
	        Pattern pattern = Pattern.compile("(.)\\1{0,}");
	        Matcher matcher = pattern.matcher(str);
	 
	        while (matcher.find()) {
	            result += matcher.group(1);
	            int length = matcher.group().length();
	            if (length > 1)
	                result += length;
	        }
	        
	        System.out.println(result);
	        
	        
	        /////////////////////
	        
	        String url = "text.xml";
	 
	        Pattern pattern1 = Pattern.compile("\\.(xml|json)");
	        Matcher matcher1 = pattern1.matcher(url);
	 
	        if(matcher1.find())  {
	        	System.out.println(matcher1.group());
			}
	        else {
	        	System.out.println("Неправильный формат");
	        }
	        
	    }
	 

}
