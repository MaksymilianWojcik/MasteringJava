package SkladniaDziedziczenia;

public class Detergent extends Cleanser{
	
	//nadpisywanie
	@Override
	public void scrub() {
		// TODO Auto-generated method stub
		append(" Detergent.scrub()");
		super.scrub(); //wywolanie wersji z klasy bazowej
	}
	
	//dodanie nowej metody
	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergent dt = new Detergent();
		dt.dilute();
		dt.apply();
		dt.scrub();
		dt.foam();
		System.out.println(dt);
		System.out.println("Test klasy bazowej: ");
		Cleanser.main(args);
	}

}
