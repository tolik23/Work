import java.util.Map;


public class Group {

	public  Group() {	
	}
	
	private String name;
	private Map<User, Includ> includ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<User, Includ> getInclud() {
		return includ;
	}
	public void setInclud(Map<User, Includ> includ) {
		this.includ = includ;
	}
	
	
}
