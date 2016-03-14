import java.util.Map;


public class User {

	private String name;
	private Map<Group, Includ> includ;
	
	public  User() {
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Group, Includ> getInclud() {
		return includ;
	}
	public void setInclud(Map<Group, Includ> includ) {
		this.includ = includ;
	}
	

}
