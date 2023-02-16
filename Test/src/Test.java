import paq1.Clase1;
import paq2.Clase2;

public class Test {
	
  	public int dato=0;
  	private int datoprivado=1;
  	protected int datoprotegido=2;
  	
  	public static int datoestatico=1;
  
  	public void metodo() {
	this.datoestatico++;
	this.dato++;
  } //metodo
  
  	public static void metodoestatico() {
		datoestatico++;
  } //metodoestatico

  	public static void main(String[] args){

// Instanciar un objeto de cada clase (Clase1, Clase2)
  		
  		Clase1 c1 =new Clase1();
  		
  		Clase2 c2= new Clase2();
  		
// Acceder a dato1 y dato2	
  		
  		c1.dato1=100;
  		System.out.println(c1.dato1);
  		
  		c2.dato2 = 200;
  		System.out.println(c2.dato2);
	  	
// Acceder a datoprivado1 y datoprivado2
  		
  		System.out.println(c1.getdatoprivado1());
  		
  		System.out.println(c2.getdatoprivado2());
  		
  		//el compilador no se queja de dos puntos y comas juntos ;;
  		// ya que el al ternminar el primero punto y coma, el buffer de la instruccion se vacia
  		//y realiza la siguiente qu estaría vacia.
  		
// Acceder a datoprotegido1 y datoprotegido2
	  
  		System.out.println(c1.getdatoprotegido1());
  		
  		System.out.println(c2.getdatoprotegido2());

  } // main
  	
} //Classddd
