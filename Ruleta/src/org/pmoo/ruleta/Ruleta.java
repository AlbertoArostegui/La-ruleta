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
		int numero;
		
		
		return numero;
	}
	
}
