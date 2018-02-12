package InicjalizacjaEgzemplarza;

public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("Zainicjalizowano mug1 i mug2 w bloku");
	}
	
	public Mugs() {
		System.out.println("Konstruktor Mugs()");
	}
	public Mugs(int i) {
		System.out.println("Konstruktor Mugs(" + i + ")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wewnatrz maina");
		new Mugs();
		System.out.println("new Mugs() - zakonczone");
		new Mugs(1);
		System.out.println("new Mugs(1) - zakonczone");
	}
	
	/* Konsola:
	 	Wewnatrz maina
		Mug(1)
		Mug(2)
		Zainicjalizowano mug1 i mug2 w bloku
		Konstruktor Mugs()
		new Mugs() - zakonczone
		Mug(1)
		Mug(2)
		Zainicjalizowano mug1 i mug2 w bloku
		Konstruktor Mugs(1)
		new Mugs(1) - zakonczone
	 */

}
