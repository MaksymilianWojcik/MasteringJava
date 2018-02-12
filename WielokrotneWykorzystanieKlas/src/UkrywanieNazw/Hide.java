package UkrywanieNazw;

public class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh('d');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}

/* OUTPUT
Doh( d)
Doh( 1.0)
doh(Milhouse)
*/