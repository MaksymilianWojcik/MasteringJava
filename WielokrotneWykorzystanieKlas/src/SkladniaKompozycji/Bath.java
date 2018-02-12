package SkladniaKompozycji;

public class Bath {
	private String //inicjalizacja w miejsciu definicji
		s1 = "Radosny",
		s2 = "Radosny",
		s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath() { //inicjaliacja w konstruktorze
		System.out.println("Wewnatrz Bath()");
		s3 = "Uradowany";
		toy = 3.14f;
		castille = new Soap();
	}
	
	//blok inicjalizacji egzemplarza:
	{
		i = 47;
	}
	
	@Override
	public String toString() {
		if (s4 == null) { //inicjalizacja leniwa
			s4 = "Uradowany";
		}
		return 
				"s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"s3 = " + s3 + "\n" + 
				"s4 = " + s4 + "\n" +
				"i = " + i + "\n" + 
				"toy = " + toy + "\n" +
				"castille = " + castille;
	}

	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}

/* Output:
Wewnatrz Bath()
Soap()
s1 = Radosny
s2 = Radosny
s3 = Uradowany
s4 = Uradowany
i = 47
toy = 3.14
castille = Skonstruowany
*/

