import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static final String MAN = "���.";
	public static final String WOMAN = "���.";

	Hospital hospital = new Hospital();

	public void mainMenu() {

		while (true) {
			String mainMenu = "1 - ����� �������.\n2 - �������� ������ � ��������.\n3 - ����� ��������.\n4 - ������� ��������.\n5 - �������� ����.\n0 - ����� ";
			System.out.println(mainMenu);
			switch (scanKay()) {
			case 1:
				newPatient();
				break;
			case 2:
				changePatient();
				break;
			case 3:
				findPatient();
				break;
			case 4:
				deletePatient();
				break;
			case 5:
				hospital.showAllPatients();
				break;
			case 0:
				return;
			}
		}
	}
	
	
	private void newPatient() { // �������� ��������.

		Patient newPatient = new Patient();

		Scanner sc = new Scanner(System.in);

		System.out.println("���: ");
		newPatient.setFirstName(sc.nextLine());

		System.out.println("�������: ");
		newPatient.setSecondName(sc.nextLine());

		System.out.println("�������: ");
		newPatient.setAge(scanKay());

		System.out.println("��� (1 - ���. / 0 - ���.): ");
		newPatient.setGender(scanKay());

		System.out.println("�������: ");
		newPatient.setDiagnos(sc.nextLine());

		newPatient.setDischarg(true);

		hospital.addPatient(newPatient);

	}
		
	private void changePatient() { //��������� ��������

		int i = findPatient();
		if (i == -1)
			return;
		
		while (true) {

			System.out.println("��� ��������?");
			System.out.println("1 - ���\n2 - �������\n3 - �������\n4 - ������� ����.\n5 - �����.");

			switch (scanKay()) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("����� ���: ");
				((Patient) hospital.patientsList.get(i)).setFirstName(sc.nextLine());
				break;
			case 2:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("����� �������: ");
				((Patient) hospital.patientsList.get(i)).setSecondName(sc1.nextLine());
				break;
			case 3:
				System.out.println("�������: ");
				((Patient) hospital.patientsList.get(i)).setAge(scanKay());
				break;
			case 4:
				((Patient) hospital.patientsList.get(i)).setDischarg(!((Patient) hospital.patientsList.get(i)).getDischarg());
				break;
			case 5:
				return;
			}
		}

	}
	
	
	private int findPatient() { // ����� ��������

		System.out.println("1- ����� �� �������. 2- ����� �� ��������. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String tempSecondName;
		int tempAge;
		
		if (a == 1) {
			System.out.println("������� ������� ��������: ");
			Scanner sc1 = new Scanner(System.in);
			tempSecondName = sc1.nextLine();
		for (int i = 0; i < hospital.patientsList.size(); i++) {

			if (((Patient) hospital.patientsList.get(i)).getSecondName().equals(tempSecondName)) {

					Patient p = (Patient) hospital.patientsList.get(i);
					
					hospital.showPatient(p);

					return i;
			}

		}
		
	System.out.println("������� �� ������.");
	return -1;
	} else {
			System.out.println("������� ������� ��������: ");
		tempAge = sc.nextInt();
		for (int i = 0; i < hospital.patientsList.size(); i++) {

		
				if (((Patient) hospital.patientsList.get(i)).getAge() == (tempAge)) {

					Patient p = (Patient) hospital.patientsList.get(i);
					
					hospital.showPatient(p);

					return i;
				}

			}
		
		System.out.println("������� �� ������.");
		return -1;
		
		}
		}

private void deletePatient() { // �������� ��������

		int i = findPatient();
		if (i != -1) {
			System.out.println("������� ��������? (1 - ������� / 2 - ������) ");
			int x = scanKay();

			if (x == 1) {
				hospital.patientsList.remove(i);
				System.out.println("������� ������. ");
				return;
			}
			if (x == 2) {
				return;
			}

		} else
			return;

	}


	private int scanKay() {

		int x;

		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				break;
			} else {
				System.out.println("������� ������������ ��������.");
			}
		}
		return x;

	}

}
