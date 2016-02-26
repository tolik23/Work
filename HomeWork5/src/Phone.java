
public class Phone extends NotEnable {

	public Phone(int releaseDate, double batteryTime, int volt) {

		this.batteryTime = batteryTime;
		this.releaseDate = releaseDate;
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
