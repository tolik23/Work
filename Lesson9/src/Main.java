import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
	SimpleDateFormat format = new SimpleDateFormat("dd.MMMM.yyyy HH:mm");
	String textDate = format.format(date);
	
    
	SimpleDateFormat format1 = new SimpleDateFormat("MMMM-yyyy z hh:mm a");
	String textDate1 = format1.format(date);
	
	 String s1;
	 
	switch (date.getDay()%10) {
	case 1:
		s1 = "st";
		break;

	case 2:
		s1 = "nd";
		break;
		
	case 3:
		s1 = "rd";
		break;
		
		default:
			s1 = "th";
	}
	System.out.print(date.getDate() + s1 + " " +textDate1);
	}
	
	

}
