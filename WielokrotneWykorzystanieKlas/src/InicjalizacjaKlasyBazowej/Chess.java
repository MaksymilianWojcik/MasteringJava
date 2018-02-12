package InicjalizacjaKlasyBazowej;

public class Chess extends BoardGame{

	//jak se chcemy
	Chess(){
		super(11);
		System.out.println("Konstruktor Chess");
	}
	
	Chess(int i) {
		super(i);
		System.out.println("Konstruktor Chess");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}

}


/* OUTPUT
	Konstruktor klasy Game
	Konstruktor klasy BoardGame
	Konstruktor Chess
*/