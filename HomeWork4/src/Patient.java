

public class Patient {
	
	private String firstName;
	private String secondName;
	private int age;
	private int gender;
	private String diagnos;
	private boolean discharg;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getDiagnos() {
		return diagnos;
	}
	public void setDiagnos(String diagnos) {
		this.diagnos = diagnos;
	}
	public boolean getDischarg() {
		return discharg;
	}
	public void setDischarg(boolean alive) {
		this.discharg = discharg;
	}
	
	
}
