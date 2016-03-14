package les;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////простой способ
		
	    User user = new User("sdgffg","sdfdfv");
		 
		///////// с помощью паттерна билдер
		
		User.Builder builder = new User.Builder();
		
		User user1 = builder
				.addName("dfgdh")  /////// первый способ
				.addSurname("dfghgh")
				.create();
				
		///////////второй способ
		
		User.Builder builder2 = new User.Builder();
		builder2.addName("dfghdfh");
		builder2.addSurname("dfggf");
		User user2 = builder2.create();
		
	}

}
