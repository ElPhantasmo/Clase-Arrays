package ar.edu.utn.asd;

import java.util.*;

public class Granja  {

	//Atributos
	
	ArrayList<Vaca> misVacas = new ArrayList<Vaca>();
	Mantequero miMantequero = new Mantequero();
	Yoghurtero miYoghurtero = new Yoghurtero();
	int tambo=0;
	int manteca=0;
	int yoghurt=0;
	
	//Metodos
	
	public Granja() {
		int i;
		Vaca unaVaca;
		for (i = 0; i < 5; i++) {
			
			unaVaca = new Vaca("DJ"+i);
			
			misVacas.add(unaVaca);
			System.out.println("llego " +unaVaca.getNombre());
		}
		
	}
	
	public void obtenerLeche() {
		int i;
		for ( i = 0; i < 5; i++) {
			tambo = tambo + misVacas.get(i).darLeche();
		}
		System.out.println("Ya tengo " +tambo+" litros de Leche");
	}
	
	public void obtenerManteca() {
		tambo = tambo - 200;
		manteca = miMantequero.hacerManteca(200);
		System.out.println("Ya tengo " +manteca+" kilos de Manteca");
	}
	
	
	public void obtenerYoghurt() {
		int lecheEnviar = 0;
		tambo = tambo - (3/4 * tambo);
		yoghurt = miYoghurtero.hacerYoghurt(lecheEnviar);
		System.out.println("Ya tengo "+yoghurt+" litros de Yoghurt");
	}
	
}
