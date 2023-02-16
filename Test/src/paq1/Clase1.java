package paq1;

public class Clase1 {

	public int dato1=10;
	private int datoprivado1=11;
	protected int datoprotegido1=12;
	
	public Clase1() {};
	
	public int getdatoprivado1() { return datoprivado1;}

	public void muestradatoprivado1() {
		
		System.out.println(this.datoprivado1);
	}
	public int getdatoprotegido1() { return datoprotegido1;}

	public void muestradatoprotegido1() {
		
		System.out.println(this.datoprotegido1);
	}
	
}
