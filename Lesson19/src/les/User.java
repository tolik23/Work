package les;

public class User {

	
	private String mName;
	private String mSurname;
	
//	public static User getUser(){              ////// фабричный метод
//		return new User("fghgjg","dffghgf");
//	}
	
	
	
	public User(String mName, String mSurname) {
		super();
		this.mName = mName;
		this.mSurname = mSurname;
	}
	public String getmName() {
		return mName;
	}

	public String getmSurname() {
		return mSurname;
	}


	public static class Builder {
		private String mName;
		private String mSurname;
		
		
		public  Builder addName(String mName) {
			this.mName = mName;
			return this;
		}
	
		public  Builder addSurname(String mSurname) {
			this.mSurname = mSurname;
			return this;
		}
		
		public User create(){
			return new User(mName,mSurname);
		}
		
	}
}
