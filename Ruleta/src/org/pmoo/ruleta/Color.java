package org.pmoo.ruleta;

public class Color extends Apuesta {
	//Atributos
	private String color;
	private double multiplicador;
	
	//Constructora
	public Color(String pColor, double pMultiplicador ) {
		super(pMultiplicador);
		this.color = pColor;
	}
	//Métodos
}
