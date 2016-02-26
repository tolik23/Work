
public class Laptop extends NotEnable {

	
	private int ram;

	public int getRam() {
		return ram;
	}

	public void setRam(int power) {
		this.ram = ram;
	}

	public Laptop(int releaseDate, int ram, int volt) {
		this.releaseDate = releaseDate;
		this.ram = ram;
		this.volt = volt;

	}

	@Override
	public void enable() {
		this.switchOn = true;
		System.out.println("Enabled");
	}

	@Override
	public void disable() {
		this.switchOn = false;
		System.out.println("Disabled");
	}
}
