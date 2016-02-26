
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class City {
			private String name;
			private String street;
			private String avenue;
			private String square;
					
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street=street;
		}
		public String getAvenue() {
			return avenue;
		}
		public void setAvenue(String avenue) {
			this.avenue=avenue;
		}
		public String getSquare() {
			return square;
		}
		public void setSquare(String square) {
			this.square=square;
		}
		}
	
	
	City city = new City();
	
	city.setName("Минск");
	city.setStreet("Варвашени");
	city.setAvenue("Партизанский");
	city.setSquare("Ленина");
	
	System.out.println("город " + city.getName());
	System.out.println("улица " + city.getStreet());
	System.out.println("проспект " + city.getAvenue());
	System.out.println("площадь " + city.getSquare());
	}

}
