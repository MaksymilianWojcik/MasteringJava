package InicjalizacjaTablic;

public class ZmienneListyArgumentowPrzeciazanie {
// PRZYKLAD PIERWSZY
//	static void f(Character... args) {
//		System.out.println("pierwszy");
//		for(Character c : args) {
//			System.out.print(" " + c);
//		}
//		System.out.println();
//	}
//	
//	static void f(Integer... args) {
//		System.out.println("drugi");
//		for(Integer c : args) {
//			System.out.print(" " + c);
//		}
//		System.out.println();
//	}
//	
//	static void f(Long... args) {
//		System.out.println("trzeci");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		f('a', 'b', 'c');
//		f(1);
//		f(2,1);
//		f(0);
//		f(0L);
//		// f(); // Niejednoznacznosc uniemozliwi kompilacje
//	}

// PRZYKLAD DRUGI - rozwiazanie problemu przeciazania:
	
	//To nie zadziala:
//	static void f(float i, Character... args) {
//		System.out.println("pierwszy");
//	}
//	
//	static void f(Character... args) {
//		System.out.println("drugi");
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//To nie zadziala
//		f(1, 'a');
//		f('a', 'b');
//	}
	//Ale to juz tak, gdy obie metody beda mialy argument niebedacy zmienna lista argumetnow
	static void f(float i, Character... args) {
		System.out.println("pierwszy");
	}
	
	static void f(char c, Character... args) {
		System.out.println("drugi");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1, 'a');
		f('a', 'b');
	}
}

//WNIOSEK: NAJLEPIEJ W OGOLE NIE PRZECIAZAZ TAKICH METOD

/* Przyklad 1:
pierwszy
 a b c
drugi
 1
drugi
 2 1
drugi
 0
trzeci


Przyklad 2:
pierwszy
drugi
*/