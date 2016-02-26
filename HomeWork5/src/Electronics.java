
public abstract class Electronics {


	protected int releaseDate;

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	protected int volt;
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	protected boolean switchOn;
	
	public boolean SwitchOn() {
		return switchOn;
	}
	public void setSwitch(boolean switchOn) {
		this.switchOn = switchOn;
	}
	public abstract void enable();
	public abstract void disable();

}
