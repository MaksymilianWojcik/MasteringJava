package Sprzatanie;

public class Triangle extends Shape {

	Triangle(int i) {
		super(i);
		System.out.println("Konstruktor Shape");
	}
	
	@Override
	void dispose() {
		System.out.println("Wymazywanie trojkata");
		super.dispose();
	}

}
