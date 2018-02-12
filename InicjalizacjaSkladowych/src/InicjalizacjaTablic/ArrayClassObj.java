package InicjalizacjaTablic;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		
//		Mozemy tez tak utworzc taka tablice:
//		Integer[] a2 = {new Integer(1), new Integer(2), new Integer(3), 4,};
		//Przecinek na ostanim elemencie jest opcjonalny - ulatiwa to automatyczne generowanie takich list
		
		System.out.println("Rozmiar tablicy a = " + a.length);
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500); // Automatyczne pakowanie w obiekt - czyli wypelniamy tablice zeby inicjalizacja byla kompletna
		}
		System.out.println(Arrays.toString(a));
	}
}

/*
Rozmiar tablicy a = 18
[55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]

*/