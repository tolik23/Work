
public class Prm extends Figure{
	
	int a, b;
	
	public Prm(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public int area() {
		int s = a*b;
		return s;
	}
	
	

}