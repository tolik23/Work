import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� �������� �����-�� �� �������� ����� �����
		Pattern pattern = Pattern.compile("test$");
		
		///������ ������� ����� ����� � ����� �� ����� ������� pattern
		Matcher matcher = pattern.matcher("gfhfghjgfh#354750646");
		
		//// ����� ���������� - � ����� ������ tru ��� false
		if(matcher.find()) {
			System.out.println("�����!!!");
		}

	}

}
