import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;


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
	System.out.println();
	
	Date myDate = null;
	try {
		myDate = format.parse("2015-09-06");
	} catch (ParseException e) {
		System.out.println("Формат неверный");
	}
	System.out.println(myDate);
	
	GregorianCalendar calendar = new GregorianCalendar();
	Date dd = calendar.getTime();
	long mill = calendar.getTimeInMillis();
	
	// получаем дату
	int day = calendar.get(GregorianCalendar.DATE);
	System.out.println(day);
	
	// получаем месяц
	int mon = calendar.get(GregorianCalendar.MONTH);
	System.out.println(mon);
	
	// задаем в календарь март
	calendar.set(GregorianCalendar.MONTH,2);
	System.out.println(calendar.getTime());
	
	// добавляем 50 дней
	calendar.add(GregorianCalendar.DATE,50);
	System.out.println(calendar.getTime());
	
	// ищем мой др
	
	
	GregorianCalendar calendar1 = new GregorianCalendar();
	GregorianCalendar calendar2 = new GregorianCalendar();
	calendar2.set(GregorianCalendar.MONTH,7);
	calendar2.set(GregorianCalendar.DATE,1);
	int m = calendar2.get(GregorianCalendar.MONTH)-calendar1.get(GregorianCalendar.MONTH);
	int d = calendar2.get(GregorianCalendar.DATE)-calendar1.get(GregorianCalendar.DATE);
	
	System.out.println(m + " мес " + d + " дней");
	
	////// второй метод
	
	Date CurrentTime = new Date();
	Date dob = calendar2.getTime();
	
	long mm = dob.getTime() - CurrentTime.getTime();
	
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTimeInMillis(mm);
	
	long days = TimeUnit.MILLISECONDS.toDays(mm);
	System.out.println(days);
	
	}
	
}
