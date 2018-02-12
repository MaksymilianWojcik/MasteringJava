package SkladniaDziedziczenia;

public class Cleanser {
	private String s = "Cleanser";
	public void append(String a) {
		s+=a;
	}
	public void dilute() {
		append(" dilute()");
	}
	
	public void apply() {
		append(" apply()");
	}
	
	public void scrub() {
		append(" scrub()");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}


//Sama ta klasa da:
/*
Cleanser dilute() apply() scrub()
*/