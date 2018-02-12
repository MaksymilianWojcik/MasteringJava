package JawnaInicjalizacjaStatyczna;

public class Inicjalizacja {
	public static void main(String[] args) {
		System.out.println("Inside main");
		Cups.cup1.f(99); //(1)
	}
	//static Cups cups1 = new Cups(); //(2)
	//static Cups cups2 = new Cups(); //(2)
}

/*
 * Output:
 * Cup(1)
 * Cup(2)
 * f(99)
 * 
 * Statyczne inicjalizatory klasy Cup wykonuja sie, gdy nastapi odwolanie do statycznego 
 * obiektu cup1 w wierszu (1) lub jezeli wiersz ten zostanie umieszczony w komentarzu, a
 * wiersze (2) odkomentowane. Jesli oba sa zakomentowane, to wiadomo - inicjalizacja 
 * statyczna klasy Cup nie nastapi nigdy.  Gdy oba sa odkomentowane, to tak czy siak 
 * nie ma to znacznenia, bo inicjalizacja statyczny wystapi i tak tylko raz.
 */
