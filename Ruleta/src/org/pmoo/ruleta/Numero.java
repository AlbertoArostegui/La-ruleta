package org.pmoo.ruleta;

public class Numero extends Apuesta {
	//Atributos
	private int numero;
	
	//Constructora
	public Numero(double pMultiplicador, int pNumero) {
		super(pMultiplicador);
		this.numero = pNumero;
	}
	//Métodos
}
