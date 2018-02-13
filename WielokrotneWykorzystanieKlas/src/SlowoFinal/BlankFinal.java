package SlowoFinal;

public class BlankFinal {
	
	private final int i = 0; //zainicjowane pole finalne
	private final int j; //puste pole finalne
	private final Poppet p; //pusta referencja finalna
	
	public BlankFinal() {
		j = 1; //inicjalizacja
		p = new Poppet(1); //inicjalizacja
	}
	
	public BlankFinal(int x) {
		j = x; //inicjalizacja
		p = new Poppet(x); //inicjalizacja
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BlankFinal();
		new BlankFinal(11);
	}

}
