package gson;

public class Root {

	private String name;
	private String people;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "Root [name=" + name + ", people=" + people + "]";
	}
	
	
}
