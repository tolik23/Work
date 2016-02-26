
public class Tele extends Enable {

	
	private double diagonal;

	public Tele(int releaseDate, double diagonal, int volt) {
		this.releaseDate = releaseDate;
		this.volt = volt;
		this.setDiagonal(diagonal);
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
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
