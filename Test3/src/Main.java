import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� �������� �����-�� �� �������� ����� �����
		
	
		Pattern pattern = Pattern.compile("^\\d{4}\\s[A-Q]{2}-[0-7]$");
		
		///������ ������� ����� ����� � ����� �� ����� ������� pattern
		Matcher matcher = pattern.matcher("+375292741017");
		
		//// ����� ���������� - � ����� ������ tru ��� false
		if(matcher.find()) {
			System.out.println("�����!!!");
		}

	}

}
