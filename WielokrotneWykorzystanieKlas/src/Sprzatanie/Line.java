package Sprzatanie;

public class Line extends Shape {
	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Konstruktor Line: " + start + ", " + end);
	}
	
	@Override
	void dispose() {
		System.out.println("Wymazywanie linii " + start + ", " + end);
		super.dispose();
	}
	
}
