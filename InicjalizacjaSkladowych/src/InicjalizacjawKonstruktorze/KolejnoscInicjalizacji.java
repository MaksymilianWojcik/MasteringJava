package InicjalizacjawKonstruktorze;

public class KolejnoscInicjalizacji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House();
		h.f();
	}

}

//KOLEJNOSC WYWOLANIA
/*

Window(1)
Window(2)
Window(3)
Konstruktor house
Window(33)
f


Kolejnosc inicjalizacji wewn¹trz klasy jest wyznaczona pzez kolejnosc definiowania zmeinnych w danej klasie. Zmienne zawsze s¹ inicjowane, zanim mo¿e
zostac wywolana jakakolwiek metoda - nawet konstruktor. Na przyklad:

*/