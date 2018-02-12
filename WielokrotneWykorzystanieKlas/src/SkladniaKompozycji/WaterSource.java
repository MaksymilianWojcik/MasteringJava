package SkladniaKompozycji;

public class WaterSource {
	private String s;
	public WaterSource() {
		System.out.println("WaterSource()");
		s = "Skonstruowano";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
}
