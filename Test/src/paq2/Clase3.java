package paq2;

public class Clase3 {

	public Clase3() {
		super();
	}

	public int getProtegido2() {
		int result=-1;
		Clase2 c2 = new Clase2();
		result = c2.datoprotegido2;
		return result;
	}
}//class
