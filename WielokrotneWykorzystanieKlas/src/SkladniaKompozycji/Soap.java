package SkladniaKompozycji;

public class Soap {
	private String s;
	Soap(){
		System.out.println("Soap()");
		s = "Skonstruowany";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
}
