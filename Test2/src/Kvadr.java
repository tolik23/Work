
public class Kvadr extends Figure{
	
	int a;
	
	public Kvadr(int a){
		this.a = a; 
	}

	@Override
	public int area() {
		int s = a*a;
		return s;
	}

}