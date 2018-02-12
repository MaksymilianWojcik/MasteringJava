package Sprzatanie;

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i+1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j*j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Konstruktor laczony CAD SYSTEM");
	}
	
	@Override
	void dispose() {
		System.out.println("Wymazywanie w cadSystem");
		//kolejnosc sprzatania jest odwrocona wzgledem kolejnosci inicjalizacji
		t.dispose();
		c.dispose();
		for (int i = lines.length - 1; i >= 0; i--) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			System.out.println("Wewnatrz try");
		} finally {
			x.dispose();
		}
	}
}

/* OUTPUT
Konstruktor figury
Konstruktor figury
Konstruktor Line: 0, 0
Konstruktor figury
Konstruktor Line: 1, 1
Konstruktor figury
Konstruktor Line: 2, 4
Konstruktor figury
Konstrutor Circle
Konstruktor figury
Konstruktor Shape
Konstruktor laczony CAD SYSTEM
Wewnatrz try
Wymazywanie w cadSystem
Wymazywanie trojkata
Usuwanie figury
Wymazywanie circle
Usuwanie figury
Wymazywanie linii 2, 4
Usuwanie figury
Wymazywanie linii 1, 1
Usuwanie figury
Wymazywanie linii 0, 0
Usuwanie figury
Usuwanie figury
*/