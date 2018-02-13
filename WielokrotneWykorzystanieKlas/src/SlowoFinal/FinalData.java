package SlowoFinal;

import java.util.Random;

public class FinalData {
	
	private static Random rand = new Random(47);
	private String id;
	
	public FinalData(String id) {
		this.id = id;
	}
	
	//Moga byc stalymi czasu kompilacji:
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	
	//Typowa stala publiczna:
	public static final int VALUE_THREE = 3;
	
	//Nie moga byc stalymi czasu kompilacji:
	private final int i4 = rand.nextInt(25);
	static final int INT_5 = rand.nextInt(25);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	
	//tablice
	private final int[] a = {1,2,3,4,5,6};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + id + ", i4: " + i4 + ", INT_5: " + INT_5;
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		//! fd1.valueOne++; // blad bo przeciez jest final, nie mozna mzienic wartosci
		fd1.v2.i++; //mozna, bo obiekt to nie stala
		fd1.v1 = new Value(9); //mozna, bo nie jest finalne
		for(int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; //mozna, bo obiekt nie jest stala
		}
		
		//! fd1.v2 = new Value(1); //nie mozna bo referencja jest juz final
		//! fd1.VAL_3 = new Value(1); //tak samo, zmiana referencji nie moze byc
		//! fd1.a = new int[3]; // nie mozemy zmienic teraz tej tabliucy na inna. Mozemy mzineic jej wartosci
		
		System.out.println(fd1);
		System.out.println("Tworzenie nowego obiektu FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);

	}

}

/* OUTPUT:
	id: fd1, i4: 5, INT_5: 8
	Tworzenie nowego obiektu FinalData
	id: fd1, i4: 5, INT_5: 8
	id: fd2, i4: 18, INT_5: 8
*/
