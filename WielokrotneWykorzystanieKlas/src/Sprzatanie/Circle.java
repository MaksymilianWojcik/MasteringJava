package Sprzatanie;

public class Circle extends Shape{

	Circle(int i) {
		super(i);
		System.out.println("Konstrutor Circle");
	}
	
	@Override
	void dispose() {
		System.out.println("Wymazywanie circle");
		super.dispose();
	}
	
}
