import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final int SIZE_STUDENT = 3;
		Student[] student = new Student[SIZE_STUDENT];
		int ch = 9;
		
		do {
			
			int maxSize = menu();
			Scanner sc = new Scanner (System.in);
			int choise = sc.nextInt();
			ch = choise;
			switch(ch) {
			
			case 1:
				inStudent(student);
				break;
				
			case 2:
				outStudent(student);
				break;
				
			case 3:
				averageAge(student);			
				break;
				
			case 4:
				inFile(student);				
				break;
				
			case 5:
				outFile(student);			
				break;
			}
		} 
		while(ch != 0);
		System.out.println("������������ ��������.");
	}
	
	
	public static int menu () {             //����
	
		final int a = 5;
	
		System.out.println("1 - ���� ������ ���������");
		System.out.println("2 - �������� ������ ���������");
		System.out.println("3 - ������� ������� ���������");
		System.out.println("4 - �������� ������ � ����");
		System.out.println("5 - �������� ������ �� �����");
		System.out.println("0 - �����");
	
		return a;
	}
	
	static void inStudent(Student[] student) {
		
		Scanner scanner1 = new Scanner(System.in);
		
		for(int i = 0; i < student.length; i++) {
			
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			
			student[i] = new Student();

			System.out.println("������� ������� �������� " + (i + 1) + " :");
			student[i].setSecondName(scanner1.nextLine());
			
			System.out.println("������� ��� �������� " + (i + 1) + " :");
			student[i].setName(scanner1.nextLine());
			
				Date date = null;
				System.out.print("������� ���� �������� �������� " + (i + 1) + " (������ ��.��.����) :");
				
				try {
					student[i].setAge(format.parse(scanner1.nextLine()));
					
				} catch (ParseException e) {
					System.out.println("������ �� ������, ������� ������.");
				}	
		}
	}
	
	static void outStudent(Student[] student) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		
		for(int i = 0; i < student.length; i++) {
			
			System.out.print("������� � " + (i + 1) + " ");
			System.out.print(student[i].getSecondName() + " ");
			System.out.print(student[i].getName() + " ");
			System.out.print("  : ");
			System.out.println(format.format(student[i].getAge()));
		}
	}
	
	
	static void averageAge(Student[] student) { 
		
		Date date = new Date();
		long time = 0;
		int j = 0;
		
		for(int i = 0; i < student.length; i++) {
			
			if(student[i] == null) {	
				continue;
				
			} else {
				++j;
			}
			
			time += (date.getTime() - student[i].getAge().getTime());
		}
		
		if(j > 0) {
			
			time /= j;
			date.setTime(time);
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.add(GregorianCalendar.YEAR, -1970);
			
			System.out.print("������� ������� ��������� " + calendar.get(GregorianCalendar.YEAR) + " ��� ");
			System.out.print(calendar.get(GregorianCalendar.MONTH) + " ������� ");
			System.out.print(calendar.get(GregorianCalendar.DAY_OF_MONTH) + " ���� ");
			System.out.print(calendar.get(GregorianCalendar.HOUR) + " ����� ");
			System.out.print(calendar.get(GregorianCalendar.MINUTE) + " ����� ");
			System.out.println(calendar.get(GregorianCalendar.SECOND) + " ������ ");
		}
	}
	
	
	static void inFile(Student[] student) { //// ������ � ����
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		File file = new File("student.txt");
		file.setWritable(true);
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(file);
			
		} catch (IOException e) {
			System.out.println("������ ������ �����");
			return;
		}
		
		for(int i = 0; i < student.length; i++) {
				
			try {
				writer.write(student[i].getSecondName());	
				writer.write('\t');	
				writer.write(student[i].getName());	
				writer.write('\t');	
				writer.write(format.format(student[i].getAge()));	
				writer.write('\n');	
				writer.flush();
					
			} catch (IOException e) {
					
				System.out.println("������ ������ �����");
				
				return;
			}
		}
		try {
			writer.close();
			
		} catch (IOException e) {
			System.out.println("������ ������ �����");
			return;
		}
		System.out.println("������ ������ � ���� ��������f");
	}
	
	
	static void outFile(Student[] student) {  /// ������ �� �����
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		File file = new File("student.txt");
		char[] bufer = new char[(int)file.length()];
		if (!file.exists()) {
	
			System.out.println("���� �� ����������");
			return;
		}
		file.setReadable(true);

		try {
			FileReader reader = new FileReader(file);
			
			try {
				
				reader.read(bufer);
				reader.close();
				
			} catch (IOException e) {
				
				System.out.println("������ ������ �����");
				return;
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("������ ������ �����");
			return;
		}
		
		String strBufer = new String(bufer);
		String[] arrBufer = strBufer.split("[\n|\t]");
		
		if(arrBufer.length != (student.length * 3)) {
			
			System.out.println("���� ������ �������� �� ���������" + arrBufer.length);
			return;
		}
		
		int j = 0;
		
		for(int i = 0; i < student.length; i++) {
			
			if(student[i] == null) {
				
				student[i] = new Student();
			}
			student[i].setSecondName(arrBufer[j++]);
			student[i].setName(arrBufer[j++]);
			
			try {
				student[i].setAge(format.parse(arrBufer[j++]));
				
			} catch (ParseException e) {
				
				System.out.println("������ ������ �����");
				return;
			}
		}
		System.out.println("������ ������ �� ����� ���������");
	}
}