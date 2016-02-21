import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static final String MAN = "муж.";
	public static final String WOMAN = "жен.";

	Hospital hospital = new Hospital();

	public void mainMenu() {

		while (true) {
			String mainMenu = "1 - Новый пациент.\n2 - Изменить данные о пациенте.\n3 - Найти пациента.\n4 - Удалить пациента.\n5 - Показать всех.\n0 - Выход ";
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
	
	
	private void newPatient() { // создание пациента.

		Patient newPatient = new Patient();

		Scanner sc = new Scanner(System.in);

		System.out.println("Имя: ");
		newPatient.setFirstName(sc.nextLine());

		System.out.println("Фамилия: ");
		newPatient.setSecondName(sc.nextLine());

		System.out.println("Возраст: ");
		newPatient.setAge(scanKay());

		System.out.println("Пол (1 - муж. / 0 - жен.): ");
		newPatient.setGender(scanKay());

		System.out.println("Диагноз: ");
		newPatient.setDiagnos(sc.nextLine());

		newPatient.setDischarg(true);

		hospital.addPatient(newPatient);

	}
		
	private void changePatient() { //изменение пациента

		int i = findPatient();
		if (i == -1)
			return;
		
		while (true) {

			System.out.println("Что изменить?");
			System.out.println("1 - Имя\n2 - Фамилия\n3 - Возраст\n4 - Пациент умер.\n5 - Назад.");

			switch (scanKay()) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Новое имя: ");
				((Patient) hospital.patientsList.get(i)).setFirstName(sc.nextLine());
				break;
			case 2:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Новая фамилия: ");
				((Patient) hospital.patientsList.get(i)).setSecondName(sc1.nextLine());
				break;
			case 3:
				System.out.println("Возраст: ");
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
	
	
	private int findPatient() { // поиск пациента

		System.out.println("1- поиск по фамилии. 2- поиск по возрасту. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String tempSecondName;
		int tempAge;
		
		if (a == 1) {
			System.out.println("Введите фамилию поциента: ");
			Scanner sc1 = new Scanner(System.in);
			tempSecondName = sc1.nextLine();
		for (int i = 0; i < hospital.patientsList.size(); i++) {

			if (((Patient) hospital.patientsList.get(i)).getSecondName().equals(tempSecondName)) {

					Patient p = (Patient) hospital.patientsList.get(i);
					
					hospital.showPatient(p);

					return i;
			}

		}
		
	System.out.println("Пациент не найден.");
	return -1;
	} else {
			System.out.println("Введите возраст поциента: ");
		tempAge = sc.nextInt();
		for (int i = 0; i < hospital.patientsList.size(); i++) {

		
				if (((Patient) hospital.patientsList.get(i)).getAge() == (tempAge)) {

					Patient p = (Patient) hospital.patientsList.get(i);
					
					hospital.showPatient(p);

					return i;
				}

			}
		
		System.out.println("Пациент не найден.");
		return -1;
		
		}
		}

private void deletePatient() { // удаление пациента

		int i = findPatient();
		if (i != -1) {
			System.out.println("Удалить пациента? (1 - удалить / 2 - отмена) ");
			int x = scanKay();

			if (x == 1) {
				hospital.patientsList.remove(i);
				System.out.println("Пациент удален. ");
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
				System.out.println("Введено неправильное значение.");
			}
		}
		return x;

	}

}
