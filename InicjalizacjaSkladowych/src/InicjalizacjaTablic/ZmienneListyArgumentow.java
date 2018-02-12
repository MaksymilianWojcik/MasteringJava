package InicjalizacjaTablic;

//Skladnaia inicjalizacji tablicy w roli mechanizmu zmiennej liczby argumentow metod. Lista argumentow zmienne jdlugosci znana jest jako varargs
public class ZmienneListyArgumentow {
//	static void printArray(Object[] args) {
//		for(Object o : args) {
//			System.out.print("obj o: " + o + ", ");
//		}
//		System.out.println("");
//	}
//	
//	public static void main(String[] args) {
//		printArray(new Object[] {new Integer(1), new Float(3.14), new Double(11.11)});
//		printArray(new Object[] {"raz", "dwa", "trzy"});
//	}
	
	//Werja od JavySE5+ 
	// Tutaj dodajmey jako argumetn: Object... args
	static void printArray(Object... args) {
		for(Object o : args) {
			System.out.print("obj o: " + o + ", ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		//mozemy przekazywac argumetny z osobna
		printArray(new Integer(1), new Float(3.14), new Double(11.11));
		printArray("raz", "dwa", "trzy");
		//albo z tablicy
		printArray((Object[])new Integer[] {1,2,3,4});
		//mozna tez przekazac pusta liste:
		printArray();
	}
}

/* Przuklad 1
	obj o: 1, obj o: 3.14, obj o: 11.11, 
	obj o: raz, obj o: dwa, obj o: trzy, 

*	Przyklad 2
	obj o: 1, obj o: 3.14, obj o: 11.11, 
	obj o: raz, obj o: dwa, obj o: trzy, 
	obj o: 1, obj o: 2, obj o: 3, obj o: 4, 
*/
