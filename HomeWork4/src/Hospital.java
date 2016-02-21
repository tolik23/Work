import java.util.ArrayList;

public class Hospital {

	ArrayList patientsList = new ArrayList();

	public void addPatient(Patient p) {
		patientsList.add(p);
	}

	public void showAllPatients() { // метод вывода всех пациентов. пункт 5
		for (int i = 0; i < patientsList.size(); i++) {
			Patient p = (Patient) patientsList.get(i);
			
			showPatient(p);
		}
	}
	
	public void showPatient(Patient p) { // метод вывода всех пациентов. пункт 5
		
			System.out.printf("%-12s", p.getFirstName());
			System.out.printf("%-15s", p.getSecondName());
			System.out.print(" " + p.getAge());

			if (p.getGender() == 1) {
				System.out.print(" " + Menu.MAN +"  ");
			} else
				System.out.print(" " + Menu.WOMAN +"  ");

			System.out.printf("%-10s", p.getDiagnos());

			if (p.getDischarg()) {
				System.out.print(" выписан\n");
			} else
				System.out.print(" не выписан\n");

		
	}

}
