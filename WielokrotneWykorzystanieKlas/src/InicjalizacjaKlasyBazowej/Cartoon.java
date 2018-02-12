package InicjalizacjaKlasyBazowej;

public class Cartoon extends Drawing {
	Cartoon(){
		System.out.println("Konstruktor Cartoon()");
	}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}

/* OUTPUT
	Konstruktor Art()
	Konstruktor Drawing()
	Konstruktor Cartoon()
*/