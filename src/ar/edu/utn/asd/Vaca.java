package ar.edu.utn.asd;

public class Vaca extends Animal {
	
	//Atributos
	String nombre;

	
	
	//Metodos
	
	public Vaca(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre( ) { 
		return this.nombre;
	}
	
	public int darLeche() {
		return 80;
	}


}
