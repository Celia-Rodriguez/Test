package paq2;

public class Clase2 {

	public int dato2=20;
	private int datoprivado2=21;
	protected int datoprotegido2=22;
	
	public Clase2() {};
	
	public int getdatoprivado2() { return datoprivado2;}

	public void muestradatoprivado2() {
		
		System.out.println(this.datoprivado2);
	}
	public int getdatoprotegido2() { return datoprotegido2;}

	public void muestradatoprotegido2() {
		
		System.out.println(this.datoprotegido2);
	}
}
