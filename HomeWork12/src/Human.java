
public class Human {

	private String surname;
	private String name;
	private String otchestvo;
	
	public Human(String surname, String name, String otchestvo) {
		this.surname = surname;
		this.name = name;
		this.otchestvo = otchestvo;
	}
	
	


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtchestvo() {
		return otchestvo;
	}

	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}
}
