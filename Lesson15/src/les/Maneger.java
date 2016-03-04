package les;

public class Maneger {
	private static class Holder {
	private static Maneger instance = new Maneger();
	}
	private Maneger() {}
	

	public static Maneger getInstance() {
		return Holder.instance;
	}
	
}
