package SkladniaKompozycji;

public class PrzykladKompozycji {
	private String val1, val2, val3, val4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "val1 = " + val1 + " " +
			   "val2 = " + val2 + " " + 
			   "val3 = " + val3 + " " +
			   "val4 = " + val4 + "\n" +
			   "i = " + i + " " + "f = " + f + " " +
			   "source = " + source;
	}
	
	public static void main(String[] args) {
		PrzykladKompozycji ob = new PrzykladKompozycji();
		System.out.println(ob); //nawet nie trzeba dopisywa .toString()
	}
}


/* OUTPUT:
WaterSource
val1 = null val2 = null val3 = null val4 = null
i = 0 f = 0.0 source = Skonstruowano
*/
