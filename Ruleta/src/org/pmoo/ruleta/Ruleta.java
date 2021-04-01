package org.pmoo.ruleta;

import java.util.Random;

public class Ruleta {
	//Atributos
	private int numero;
	private static Ruleta miRuleta;
	
	
	//Constructora
	private Ruleta() {
		
	}
	//Métodos
	
	public Ruleta getMiRuleta()	{
		if (miRuleta == null) {
			this.miRuleta = new Ruleta();
		}
		return miRuleta;
	}
	public int girarRuleta() {
		Random rand = new Random();	   //Clase random para generar números aleatorios desde rand
		int numero = rand.nextInt(35); //método para generar número aleatorio
		
		return numero;
	}
	
}
