package InicjalizacjaZmiennychStatycznych;

public class KolejnoscInicjalizacji {
	
	public static void main(String[] args) {
		System.out.println("Tworzenie nowego obiektu Cupboard() w mainie");
		new Cupboard();
		System.out.println("Tworzenie nowego obiektu Cupboard() w mainie");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
		System.out.println("Koniec maina");
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
	
}


/*
	Kolejnosc wywolywania:
	Bowl(1)
	Bowl(2)
	Table()
	f1(1)
	Bowl(4)
	Bowl(5)
	Bowl(3)
	Cupborad()
	f1(2)
	Tworzenie nowego obiektu Cupboard() w mainie
	Bowl(3)
	Cupborad()
	f1(2)
	Tworzenie nowego obiektu Cupboard() w mainie
	Bowl(3)
	Cupborad()
	f1(2)
	f2(1)
	f3(1)
	
	Istnieje tylko pojedynczy fragment pamieci dla skladowych statycznych, niezaleznie od tego jak wiele obiekto zostanie utworzonych. Slowiem statycznym nie mozna okreslac zmiennych lokalnych,
tylko skladowe klas. Jesli skladowa jest statyczna wartoscia typu podstawowego i nie jest zainicjalizowana, to przypisana zostanie domyslna wartosc pocz¹tkowa (np 0, albo "" itp.) dla jej typu.
Jezeli jest referencja obiektu, to uzyska null.

> Kiedy nastepuje inicjalizacja zmiennych statycznych?

Inicjalizacja stsatyczna wystepuje przed inicjalizacjami niestatycznymi. Inicjalizacja statyczna wystepuje tylko wtedy, gdy jest potrzebna. 
Tak samo w klasie z metoda main, najpierw inicjalizowane sa zmienne, jeszcze przed uruchomieniem metody main.
Kolejnsoc jest nastepujaca: najpierw zmienne static, jezeli jeszcze nie zostaly zainicjalizowane przez poprzednie stworzenie obiektu, a nastepnie obiekty niestatyczne. 

*/